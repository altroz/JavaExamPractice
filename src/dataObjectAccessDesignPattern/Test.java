package dataObjectAccessDesignPattern;

public class Test {
	public static void main(String[] args) {
		Circle circle = new Circle(10, 10, 20);
		System.out.println(circle);
		CircleTransfer circleTransfer = circle.getCircleTransferObject();
		CircleDAO circleDAO = DAOFactory.getCircleDAO("RDBMSDAO");
		circleDAO.insertCircle(circleTransfer);
	}
}
