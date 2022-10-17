package heroes;

public class Chamber implements Heroes, Sentinel {

	@Override
	public void c() {
		System.out.println("Yere tuzak at ve önünden geçen düşman olursa info al");	
		
	}

	@Override
	public void q() {
		System.out.println("Max 8 mermisi olan tabancanı çek");	
		
	}

	@Override
	public void e() {
		System.out.println("İki farklı yere kart at ve onlar arasında ışınlan");	
		
	}

	@Override
	public void ult() {
		System.out.println("5 mermisi olan sniperını çek");	
		
	}

	@Override
	public void SiteSavun() {
		System.out.println("Işınlanmaların sayesinde bulunduğun sitea gelen rakiplerden birini vurup kaçmaya çalış ve tuzağınla info al");	
		
	}

}
