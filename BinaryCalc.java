
public class BinaryCalc {
	int convert(String s) {
		int res = 0;
		int pow = 1;
		char[] charr = s.toCharArray();
		for(int i = charr.length - 1; i >= 0; i--) {
			res = pow*Character.getNumericValue(charr[i]) + res;
			pow *= 2;
		}
		return res;
	}
	String convert(int n) {
		if (n == 0)
			return "0";
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			sb.append(n&1);
			n >>= 1;
		}
		sb.reverse();
		return sb.toString();	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryCalc obj = new BinaryCalc();
		System.out.println(obj.convert(8));
		String[] s = {"1", "10", "11", "100", "101", "110", "111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111", "10000", "10001", "10010", "10011", "10100", "10101", "10110", "10111", "11000", "11001"};
		for(int i = 0; i < s.length; i++)
			System.out.println(obj.convert(s[i]));
	}

}
