package Application;

public class DadosJogador {
	
	protected String name;
	protected String secondName;
	protected String nickName;
	protected Integer age;
	
	public DadosJogador(String nickName) {
		this.nickName = nickName;
		
	}
	public DadosJogador(String name, String secondName, Integer age) {
		this.name=name;
		this.secondName =secondName;
		this.age = age;
		
	}
	public String getName() {
		return name;
	}
	public String getSecondName() {
		return secondName;
	}
	public String getNickName() {
		return nickName;
	}
	public Integer getAge() {
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSecondName(String secondName) {
		this.secondName=secondName;
	}
	public void setNickName(String nickName) {
		this.nickName=nickName;
	}
	public void setAge(Integer age) {
		this.age=age;
	}
	
	
	
	
	
	
	
	

}
