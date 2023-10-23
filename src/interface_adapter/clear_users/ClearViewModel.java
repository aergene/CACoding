package interface_adapter.clear_users;

// TODO Complete me

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel {
    private ClearState clearState = new ClearState();

    public ClearState getClearState() {
        return clearState;
    }

    public void setClearState(ClearState clearState) {
        this.clearState = clearState;
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    // This is what the Signup Presenter will call to let the ViewModel know
    // to alert the View
    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.getClearState());
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}