public class FindSubstrings {

    public static int SubStrings(String str,int len)
    {
        int count =0;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<=len;j++)
            {
                System.out.println(str.substring(i,j));
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args)
    {
        String str="abcd" +
                "";
        int n=SubStrings(str,str.length());
        System.out.println(n);
    }
}
