package interface_adapter.clear_users;

// TODO Complete me

import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void printUsers(ClearOutputData user) {
        String names = user.getNames();
        ClearState currentState = clearViewModel.getClearState();
        currentState.setNames(names);
        clearViewModel.firePropertyChanged();
    }
}