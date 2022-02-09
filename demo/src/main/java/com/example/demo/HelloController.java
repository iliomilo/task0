package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField sumField;
    public Label bigTipsLabel;
    public Label midTipsLabel;
    public Label smallTipsLabel;

    Procent objProcent = new Procent();

    final int bigPercent = 15; //Настроение класс
    final int midPercent = 10; //Обычное настроение
    final int smallPercent = 3; //Официант плюнул в лицо

    private void callFunc(Label l, int pr) {
        try {
            l.setText("Расчет:  " + objProcent.countSumTrunc(Double.parseDouble(sumField.getText()), pr));
        }
        catch (Exception e) {
            var alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Сообщение об ошибке");
            alert.setHeaderText(null);
            alert.setContentText("Произошла ошибка при расчёте: сумма в чеке введена некорректно.");
            alert.showAndWait();
        }
    }

    @FXML
    protected void onBigTipsClick() {
        callFunc(bigTipsLabel, bigPercent);
    }
    @FXML
    protected void onMidTipsClick() {
        callFunc(midTipsLabel, midPercent);
    }
    @FXML
    protected void onSmallTipsClick() {
        callFunc(smallTipsLabel, smallPercent);
    }
}