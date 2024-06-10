package fc.java.model;

public class CarDTO {
    public int carSn;    // public이 없으면 default가 생략되어있음 = 패키지 외부에서 접근할 수 없음
    public String carName;
    public int carPrice;
    public String carOwner;
    public int carYear;
    public String carType;
}
