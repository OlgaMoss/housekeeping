package olgaMoss.housekeeping.view;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;
import olgaMoss.housekeeping.MainApp;
import olgaMoss.housekeeping.model.Operation;

public class RootLayoutController {
    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void handleBill() {
        mainApp.showBillOverview();
    }

    @FXML
    private void handleRevenueOperation() {
        mainApp.showOperationOverview(true);
    }

    @FXML
    private void handleExpensesOperation() {
        mainApp.showOperationOverview(false);
    }

    @FXML
    private void handleCategory() {
        mainApp.showCategoryOverview();
    }


    @FXML
    private void handleStatistics() {
        mainApp. showBirthdayStatistics();
    }


    @FXML
    private void handleSettings() {
//        Operation tempOperation = new Operation();
//        boolean okClicked = mainApp.showOperationEditDialogWizard(tempOperation);
//        if (okClicked) {
//            mainApp.getRevenueOperationData().add(tempOperation);
//        }
//        mainApp.getPrimaryStage().getScene().getStylesheets().add(MainApp.class.getResource("view/darkTheme.css").toExternalForm());
    }

}
