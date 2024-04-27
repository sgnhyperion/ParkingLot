package services;

import exceptions.InvalidGateException;
import models.Gate;
import models.Ticket;
import models.enums.VehicleType;
import repositories.GateRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;

    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket (Long gateId, String vehicleNumber , String ownerName , VehicleType vehicleType) throws InvalidGateException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);
        if(optionalGate.isEmpty()){
            throw new InvalidGateException("Invalid Gate Id");
        }

        Gate gate = optionalGate.get();
        ticket.setEntryGate(gate);
        ticket.setOperator(gate.getOperator());

        return null;
    }
}
