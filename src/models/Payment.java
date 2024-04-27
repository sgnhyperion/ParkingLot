package models;
import models.enums.PaymentMode;
import models.status.PaymentStatus;

import java.util.Date;

public class Payment extends BaseModel{
    private PaymentMode mode;
    private PaymentStatus status;
    private Date time;
    private double amount;

}