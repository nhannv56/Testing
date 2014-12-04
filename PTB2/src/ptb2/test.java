/**
 * 
 */
package ptb2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Admin
 *
 */
public class test {
	@Test
	public void suyBienABang0() {
		ptb2 pt = new ptb2();
		dapAn da = new dapAn(Global.flag_SuyBienA, -5 / 4, -5 / 4);
		dapAn result = pt.giaiPT(0, 4, 5);
		
		assertTrue(da.equals(result));

	}
	@Test
	public void suyBienABBang0() {
		ptb2 pt = new ptb2();
		dapAn da = new dapAn(Global.flag_LoiChia0, 0, 0);
		dapAn result = pt.giaiPT(0, 0, 4);
		assertTrue(da.equals(result));
	}
	@Test
	public void nghiemKep(){
		ptb2 pt = new ptb2();
		dapAn da = new dapAn(Global.flag_Nghiemkep, 1, 1);
		dapAn result = pt.giaiPT(1,-2,1);
		assertTrue(da.equals(result));
	}
	@Test
	public void haiNghiem(){
		ptb2 pt = new ptb2();
		dapAn da = new dapAn(Global.flag_2Nghiem, 1, 2);
		dapAn result = pt.giaiPT(3,-9,6);
		assertTrue(da.equals(result));
	}
	@Test
	public void voNghiem(){
		ptb2 pt = new ptb2();
		dapAn da = new dapAn(Global.flag_VoNghiem, 0, 0);
		dapAn result = pt.giaiPT(1,2,3);
		assertTrue(da.equals(result));
	}
}
