import javax.swing.JOptionPane;
        public class exemplu {
            public static void main (String [] args)
            {
                int g= -1 ;
                while (g<0)
                {
                    String input = JOptionPane.showInputDialog(null, "Please enter your name","First exemple", JOptionPane.INFORMATION_MESSAGE);
                    //inputMinutes = JOptionPane.showInputDialog(null, "Please enter minutes for conversion", "Minutes Conversion", JOptionPane.INFORMATION_MESSAGE);	
                    if (input.length()>0)
                    {
                        g++;
                                System.out.println(input);
                    }
                    else
                        System.out.println("Enter your name!");
                }
            }
    
}
//https://www.youtube.com/watch?v=E3JQrxxQKIo