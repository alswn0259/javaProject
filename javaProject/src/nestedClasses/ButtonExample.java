package nestedClasses;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener()); //OnClickListener 구현하는 객체 와야됨
		btn.touch(); //어떤 구현객체가 왔느냐에 따라 Button.onClick() 이 실행됨
		
		btn.setOnClickListener(new MessageListener()); //OnClickListener 구현하는 객체 와야됨
		btn.touch();
		
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("영상을 보냅니다");
				
			}
		});
		

	}

}
