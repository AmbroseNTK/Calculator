package kiet.nguyentuan.math;

import java.util.ArrayList;

public class ErrorHandle {
	private ArrayList<String> messageList;
	public ErrorHandle(){
		messageList=new ArrayList<>();
	}
	public void setError(String mess){
		messageList.add(mess);
	}
	public ArrayList<String> getErrorList(){
		return messageList;
	}
}
