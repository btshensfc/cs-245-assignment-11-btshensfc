public class Test{
public static void main(String[] args)
	{
		int[][] trust1 = [[1,2]];
		int[][] trust2 = {{1,3},{2,3}};
		int[][] trust3 = {{1,3},{2,3},{3,1}};
		int[][] trust4 = {{1,2},{2,3}};
		int[][] trust5 = {{1,3},{1,4},{2,3},{2,4},{4,3}};

		Judge j = new Judge();
		System.out.println(j.findJudge(2,trust1));
		System.out.println(j.findJudge(3,trust2));
		System.out.println(j.findJudge(3,trust3));
		System.out.println(j.findJudge(3,trust4));
		System.out.println(j.findJudge(4,trust5));
	}
}