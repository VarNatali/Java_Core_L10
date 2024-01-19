package ua.lviv.lgs.task01;

public class MyExeption extends Exception {
    private String mes;

    public MyExeption(String mes) {
        super(mes);
        this.mes = mes;
    }

    public String getMessage() {
        return mes;
    }
}
