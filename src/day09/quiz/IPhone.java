package day09.quiz;

public class IPhone extends SmartPhone implements Camera, PhoneCall, Pencil{

    public IPhone(String name) {
        super(name);
    }

    @Override
    public String information() {
        return "아이폰은"+super.getModel()+"에서 만들어졌고"+charge()+"\n"+takePicture()+"\n"+makeCall()+"\n"+takeCall()+"\n"+touchDisplay()+"\n"+bluetoothPen();
    }

    @Override
    public String charge() {
        return "고속충전, 고속 무선 충전";
    }

    @Override
    public String takePicture() {
        return  "1200만 1600만 트리플 카메라";
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름";
    }

    @Override
    public String takeCall() {
        return "전화받기 버튼을 누름";
    }

    @Override
    public String touchDisplay() {
        return "정전식, 와콤펜 지원"+
                "블루투스 펜 탑재 여부 : false";
    }

    @Override
    public boolean bluetoothPen() {
        return false;
    }
}
