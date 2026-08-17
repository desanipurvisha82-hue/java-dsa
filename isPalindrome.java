public class isPalindrome
{
    public static void main(String args[])
    {
        String s = "A man, a plan, a canal: Panama";

        int l = 0;
        int r = s.length() - 1;

        while(l < r)
        {
            char chl = Character.toLowerCase(s.charAt(l));
            char clr = Character.toLowerCase(s.charAt(r));

            // Left character is not alphanumeric
            if(!((chl >= 'a' && chl <= 'z') ||
                 (chl >= '0' && chl <= '9')))
            {
                l++;
            }

            // Right character is not alphanumeric
            else if(!((clr >= 'a' && clr <= 'z') ||
                      (clr >= '0' && clr <= '9')))
            {
                r--;
            }

            // Both characters are alphanumeric
            else
            {
                if(chl != clr)
                {
                    System.out.println("Not Palindrome");
                    return;
                }

                l++;
                r--;
            }
        }

        System.out.println("Palindrome");
    }
}