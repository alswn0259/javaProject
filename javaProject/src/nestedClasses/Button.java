package nestedClasses;

public class Button {
	OnClickListener listener; //인터페이스도 필드로 선언할 수 있다.
	
	void setOnClickListener(OnClickListener listener) { 
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}
