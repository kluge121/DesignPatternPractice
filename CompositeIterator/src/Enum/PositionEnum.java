package Enum;

public enum PositionEnum {
    Employee(0), AssitantManager(1), Manager(2), DeputyGeneralManager(3), GerneralManager(4), Director(5);
    private int value;

    private PositionEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        switch (this) {
            case Employee:
                return "사원";
            case AssitantManager:
                return "대리";
            case Manager:
                return "과장";
            case DeputyGeneralManager:
                return "차장";
            case GerneralManager:
                return "부장";
            case Director:
                return "이사";
            default:
                return super.toString();

        }

    }
}
