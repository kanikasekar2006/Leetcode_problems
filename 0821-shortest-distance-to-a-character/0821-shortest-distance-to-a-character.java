class Solution 
{
    public int[] shortestToChar(String s, char c) 
    {
        int n = s.length();
        int arr[] = new int[n];
        int p1 = 0;
        int p2 = 0;
        int prev = -100000; 

        while (p2 < n && p1 < n)
        {
            if (s.charAt(p2) == c)
            {
                int x = Math.abs(p1 - prev);

                if (p2 - p1 <= x)
                {
                    arr[p1] = p2 - p1;
                }
                else
                {
                    arr[p1] = x;
                }
                if (p1 == p2)
                {
                    prev = p2;
                    p2++; 
                }
                p1++;
            }
            else if (p2 == n - 1) 
            {
                arr[p1] = Math.abs(p1 - prev);
                p1++;
            }
            else
            {
                p2++;
            }
        }
        return arr;
    }
}