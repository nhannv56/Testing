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
	public void suyBien1() {
		ptb2 pt = new ptb2();
		dapAn da = new dapAn(Global.flag_SuyBien, -5 / 4, -5 / 4);
		dapAn result = pt.giaiPT(0, 4, 5);
		
		assertTrue(da.equals(result));

	}
	@Test
	public void suyBien2() {
		ptb2 pt = new ptb2();
		dapAn da = new dapAn(Global.flag_SuyBien, 0, 0);
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
	public void HaiNghiem(){
		ptb2 pt = new ptb2();
		dapAn da = new dapAn(Global.flag_2Nghiem, 1, 2);
		dapAn result = pt.giaiPT(3,-9,6);
		assertTrue(da.equals(result));
	}
}
