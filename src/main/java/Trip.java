

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

//Example trip container
public class Trip {
    private long _orderId;
    private Date _bookedOn;
    private List<String> _destinations;
    private String _thankYou;
    private Payment _payment;
    ///     Holds status of Trip instance.
    ///     Do not arbitrarily change.
    ///     Must be managed by TripState machine.
    private TripState.Status _tripStateStatus;


    public Trip(){
        _tripStateStatus = TripState.Status.Create;
        _destinations = new ArrayList<String>();
    }

    //Getters and setters
    public long getOrderId() {
        return _orderId;
    }
    public void setOrderId(long _orderId) {
        this._orderId = _orderId;
    }
    public Date getBookedOn() {
        return _bookedOn;
    }
    public void setBookedOn(Date _bookedOn) {
        this._bookedOn = _bookedOn;
    }
    public List<String> getDestinations() {
        return _destinations;
    }
    public void setDestinations(List<String> _destinations) {
        this._destinations = _destinations;
    }
    public String getThankYou() {
        return _thankYou;
    }
    public void setThankYou(String _thankYou) {
        this._thankYou = _thankYou;
    }
    public Payment getPayment() {
        return _payment;
    }
    public void setPayment(Payment _payment) {
        this._payment = _payment;
    }
    public TripState.Status getTripStateStatus() {
        return _tripStateStatus;
    }
    public void setTripStateStatus(TripState.Status _tripStateStatus) {
        this._tripStateStatus = _tripStateStatus;
    }
    //End getters and setters


}
