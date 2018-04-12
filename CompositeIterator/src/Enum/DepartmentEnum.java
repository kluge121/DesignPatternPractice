package Enum;

public enum DepartmentEnum {

    Sale(0), Product(1), HumanResource(2), Company(3);
    private int value;

    private DepartmentEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    @Override
    public String toString() {
        switch (this) {
            case Sale:
                return "영업부";
            case Product:
                return "생산부";
            case HumanResource:
                return "인사부";
            case Company:
                return "한밭 컴퍼니";
            default:
                return super.toString();
        }
    }
}
