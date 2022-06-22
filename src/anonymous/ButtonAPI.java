package anonymous;

class Button {
	OnClickListener ocl;
	void setOnClickListener (OnClickListener ocl) {
		this.ocl = ocl;
	}
	interface OnClickListener {
		public abstract void onClick();
	}
	void onClick () {
		ocl.onClick();
	}
}

public class ButtonAPI {

	public static void main(String[] args) {
		Button btn1 = new Button();
		btn1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("개발자 : 음악 재생");
			
			}
		});
		btn1.onClick();

	}

}
