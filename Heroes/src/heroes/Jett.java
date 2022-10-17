package heroes;

public class Jett implements Heroes, Duelist, Passive {

	@Override
	public void c() {
		System.out.println("Smoke at");	
		
	}

	@Override
	public void q() {
		System.out.println("Yükseğe zıpla");	
		
	}

	@Override
	public void e() {
		System.out.println("dash at");	
		
	}

	@Override
	public void ult() {
		System.out.println("5 bıçağın var");	
		
	}

	@Override
	public void siteAc() {
		System.out.println("Dashini ve Zıplamanı kullanarak sitedaki düşmanlarının aimini bozarak kill almaya çalış");	
		
	}

	@Override
	public void pasif() {
		System.out.println("Space tuşuna basılı tutarak havada süzül");	
		
	}

}
