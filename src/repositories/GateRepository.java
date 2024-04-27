package repositories;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import models.Gate;
import models.Operator;

public class GateRepository {
    private Map<Long, Gate> gates = new HashMap<>();

    public Optional<Gate> findById(long gateId) {
        if(gates.containsKey(gateId)) {
            return Optional.of(gates.get(gateId));
        }
        return Optional.empty();
    }
}
