package Tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Main.PlayerProxy;

class TestPlayerProxy {

	@Test
	void TestNoPlayerHit() {
		PlayerProxy proxy = new PlayerProxy();
		String result = proxy.hits();
		
		Assert.assertEquals("There is no one to hit!", result);
	}

	@Test
	void TestPlayerThrows() {
		PlayerProxy proxy = new PlayerProxy();
		proxy.setPlayer("Soren");
		String result = proxy.throwing();
		
		Assert.assertEquals("Soren throws the ball", result);
	}

	@Test
	void TestPlayerHits() {
		PlayerProxy proxy = new PlayerProxy();
		proxy.setPlayer("Soren");
		String result = proxy.hits();
		
		Assert.assertEquals("Soren hit the ball", result);
	}
}
