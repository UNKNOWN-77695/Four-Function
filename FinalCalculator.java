import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.lang.*;
import java.lang.reflect.Array;
import java.util.*;
import static java.lang.System.out;
public class FinalCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Final Calculator");
        ArrayList<JTextField> field = new ArrayList<JTextField>();
        field.add(new JTextField("Total Term Weight: "));
        field.add(new JTextField("Final Weight: "));
        field.add(new JTextField("Number of Terms: "));
        field.add(new JTextField("Grade Wanted: "));
        field.add(new JTextField("Term 1 Grade: "));
        field.add(new JTextField("Term 2 Grade: "));
        field.add(new JTextField("Term 3 Grade: "));
        field.add(new JTextField("Term 4 Grade: "));
        field.add(new JTextField("Term 5 Grade: "));
        Color color = frame.getBackground();
        for(int i = 0; i < 4; ++i){
            field.get(i).setBounds(20,20 + 30*i, 120,20);
        }
        for(int i = 4; i < 9; ++i){
            field.get(i).setBounds(20,40 + 30*i, 120,20);
        }
        for(int i = 0; i < 9; ++i){
            field.get(i).setEditable(false);
            field.get(i).setBackground(color);
            field.get(i).setBorder(new LineBorder(color,1));
            field.get(i).setVisible(true);
            frame.add(field.get(i));
        }
        int[] nums = new int[5];
        int ab = 0;
        for(int i = 0; i < 9; ++i){
            if(i != 2){
                field.add(new JTextField(""));
                field.get(field.size()-1).setBackground(Color.WHITE);
                field.get(field.size()-1).setBorder(new LineBorder(Color.BLACK,1));
                if(i < 4){
                    field.get(field.size()-1).setEditable(true);
                    field.get(field.size()-1).setBounds(150,20 + 30*i, 120,20);
                }
                else{
                    nums[ab++] = field.size()-1;
                    field.get(field.size()-1).setEditable(false);
                    if(i == 4){
                        field.get(field.size()-1).setEditable(true);
                    }
                    field.get(field.size()-1).setBounds(150,40 + 30*i, 120,20);
                }
                field.get(field.size()-1).setVisible(true);
                frame.add(field.get(field.size()-1));
            }
        }
        JComboBox<Integer> drop_Down_Menu = new JComboBox<>();
        for(int i = 1; i <= 5; ++i){
            drop_Down_Menu.addItem(i);
        }
        drop_Down_Menu.addActionListener(e->{
            for(int i = 0; i <= drop_Down_Menu.getSelectedIndex(); ++i){
                field.get(nums[i]).setEditable(true);
            }
            for(int i = 13+drop_Down_Menu.getSelectedIndex(); i < field.size(); ++i){
                field.get(i).setText("");
                field.get(i).setEditable(false);
            }
        });
        field.get(9).setText("85");
        field.get(10).setText("15");
        field.get(11).setText("90");
        JButton calc = new JButton("Calculate");
        JTextArea Display = new JTextArea("\tFinal Grade\n");
        Display.setBounds(20,390,250,30);
        Display.setVisible(true);
        Display.setEditable(false);
        frame.add(Display);
        calc.setBounds(20,320,250,30);
        JButton clear = new JButton("Clear");
        clear.setBounds(20,360,250,30);
        clear.setVisible(true);
        frame.add(clear);
        calc.setVisible(true);
        drop_Down_Menu.setBounds(150,80,120,20);
        calc.setVisible(true);
        frame.add(drop_Down_Menu);
        frame.add(calc);
        frame.setSize(300,500);
        frame.setLayout(null);
        frame.setVisible(true);
        clear.addActionListener(e->{
            for(int i = 12; i < field.size(); ++i){
                field.get(i).setText("");
            }
        });
        calc.addActionListener(e->{
            Display.setEditable(true);
            Display.setText("");
            Display.setEditable(false);
            ArrayList<String> strings = new ArrayList<>();
            for(int i = 9; i < field.size(); ++i){
                strings.add(field.get(i).getText());
            }
            ArrayList<Double> doubles = new ArrayList<>();
            int c = drop_Down_Menu.getSelectedIndex() + 1;
            for(String str:strings){
                if(!str.equals("")){
                    try{
                        doubles.add(Double.parseDouble((str)));
                    }
                    catch(Exception E){
                        Display.setEditable(true);
                        Display.setText("\tFinal Grade\n\tEnter a valid number");
                        Display.setEditable(false);
                    }
                }
            }
//            out.println(doubles.toString());
            if(Display.getText().equals("\tFinal Grade\n\tEnter a valid number")){
//                System.out.println("HELP\n");
                doubles.clear();
            }
            else if(doubles.get(0) + doubles.get(1) != 100){
                Display.setEditable(true);
                Display.setText("\tFinal Grade\n\tPercentage sum error");
                Display.setEditable(false);
            }
            else if(doubles.size() - 3 != c){
                Display.setEditable(true);
                Display.setText("\tFinal Grade\n\tIncomplete list error");
                Display.setEditable(false);
            }
            else if(doubles.get(1) <= 0 || doubles.get(0) <= 0){
                Display.setEditable(true);
                Display.setText("\tFinal Grade\n\tInvalid percentage error");
                Display.setEditable(false);
            }
            else{
                double ans = doubles.get(0)/100.0;
                double A = 0;
                for(int i = 3; i < doubles.size();++i){
                    A += doubles.get(i);
                }
                ans *= A/(double)c;
//                out.println(A + " " + ans);
                ans = (doubles.get(2) - ans)/(doubles.get(1)/100.0);
                Display.setEditable(true);
                Display.setText("\tFinal Grade\n\t" + String.format("%.5f",ans));
                Display.setEditable(false);
//                for(int i = 12; i < field.size(); ++i){
//                    field.get(i).setText("");
//                }
            }
        });
    }
}
