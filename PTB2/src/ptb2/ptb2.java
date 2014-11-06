package ptb2;

public class ptb2 {

	public static void main(String[] args) {
		ptb2 pt = new ptb2();
		dapAn da = new dapAn(Global.flag_2Nghiem, 1, 2);
		dapAn r=pt.giaiPT(3, -9, 6);
		System.out.println(r);
		System.out.println(da);
		if(r.equals(da)){
			System.out.println(da);
		}
	}

	dapAn giaiPT(int a, int b, int c) {
		dapAn result = new dapAn();
		if (0 == a) {
			result.flag = Global.flag_SuyBien;
			result.x1 = result.x2 = -c / b;
			return result;
		} else {
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				result.flag = Global.flag_VoNghiem;
			} else {
				if (delta == 0) {
					result.x1 = result.x2 = -b / (2 * a);
					result.flag = Global.flag_Nghiemkep;
				} else {
					float sqrtDelta = (float) Math.sqrt(delta);
					result.x1 = (-b + sqrtDelta) / (2 * a);
					result.x2 =	(-b - sqrtDelta) / (2 * a);
					result.flag = Global.flag_2Nghiem;
				}
			}
		}
		return result;
	}

}
