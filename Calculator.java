import javax.swing.*;
import java.lang.*;
import java.util.ArrayList;
public class Calculator{
    public static void parse(StringBuilder sb){
        StringBuilder SB = new StringBuilder(sb);
        sb.setLength(0);
        for(int i = 0; i < SB.length(); ++i){
            if(SB.charAt(i) != '\n'){
                sb.append(SB.charAt(i));
            }
        }
        ArrayList<Double> numbers = new ArrayList<Double>();
        ArrayList<Character> operations = new ArrayList<>();
        int I = 0;
        int K;
        while(I < sb.length()){
            K = I + 1;
            while(K < sb.length() && (Character.isDigit(sb.charAt(K)) || sb.charAt(K) == '.')){
                ++K;
            }
            numbers.add(Double.parseDouble(sb.substring(I,K)));
            if(K < sb.length()-1){
                operations.add(sb.charAt(K));
            }
            I = K + 1;
        }
        double ans = numbers.get(0);
        I = 0;
        for(Character c:operations){
            if(c == '+'){
                ans += (numbers.get(++I));
            }
            if(c == '-'){
                ans -= (numbers.get(++I));
            }
            if(c == '*'){
                ans *= (numbers.get(++I));
            }
            if(c == '/'){
                ans /= (numbers.get(++I));
            }
        }
        sb.setLength(0);
        if(ans % 1 == 0){
            sb.append((long)ans);
        }
        else{
            sb.append(String.format("%5f",ans));
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JButton boom = new JButton("+");
        boom.setBounds(400,100,60,60);
        JButton rocket = new JButton("C");
        rocket.setBounds(330,100,60,60);
        JButton ok = new JButton("+/-");
        ok.setBounds(260,100,60,60);
        JButton dot = new JButton(".");
        dot.setBounds(190,100,60,60);
        JButton minus = new JButton("-");
        minus.setBounds(400,170,60,60);
        JButton multiply = new JButton("*");
        multiply.setBounds(400,240,60,60);
        frame.add(multiply);
        JButton divide = new JButton("/");
        divide.setBounds(400,310,60,60);
        JButton equals = new JButton("=");
        equals.setBounds(120,380,340,60);
        JButton one = new JButton("1");
        one.setBounds(120,170,60,60);
        JButton two = new JButton("2");
        two.setBounds(190,170,60,60);
        JButton three = new JButton("3");
        three.setBounds(260,170,60,60);
        JButton four = new JButton("4");
        four.setBounds(120,240,60,60);
        JButton five = new JButton("5");
        five.setBounds(190,240,60,60);
        frame.add(five);
        JButton six = new JButton("6");
        six.setBounds(260,240,60,60);
        JButton seven = new JButton("7");
        seven.setBounds(120,310,60,60);
        JButton eight = new JButton("8");
        eight.setBounds(190,310,60,60);
        JButton nine = new JButton("9");
        nine.setBounds(260,310,60,60);
        JButton zero = new JButton("0");
        zero.setBounds(330,170,60,200);
        StringBuilder sb = new StringBuilder();
        JTextArea display = new JTextArea(sb.toString());
        display.setBounds(120,30,350,60);
        display.setEditable(false);
        StringBuilder check = new StringBuilder();
        frame.add(display);
        frame.add(zero);
        frame.add(nine);
        frame.add(eight);
        frame.add(seven);
        frame.add(six);
        frame.add(four);
        frame.add(three);
        frame.add(two);
        frame.add(one);
        frame.add(equals);
        frame.add(divide);
        frame.add(multiply);
        frame.add(minus);
        frame.add(dot);
        frame.add(ok);
        frame.add(boom);
        frame.add(rocket);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        display.setEditable(true);
        display.setText(sb.toString());
        display.setEditable(false);
        one.addActionListener(e->{
            if(!check.isEmpty()){
                sb.setLength(0);
                check.setLength(0);
            }
            if(sb.isEmpty()){
                sb.append("\n\n");
            }
            sb.append(1);
            display.setEditable(true);
            display.setText(sb.toString());
            display.setEditable(false);

        });
        two.addActionListener(e->{
            if(!check.isEmpty()){
                sb.setLength(0);
                check.setLength(0);
            }
            if(sb.isEmpty()){
                sb.append("\n\n");
            }
            sb.append(2);
            display.setEditable(true);
            display.setText(sb.toString());
            display.setEditable(false);
        });
        three.addActionListener(e->{
            if(!check.isEmpty()){
                sb.setLength(0);
                check.setLength(0);
            }
            if(sb.isEmpty()){
                sb.append("\n\n");
            }
            sb.append(3);
            display.setEditable(true);
            display.setText(sb.toString());
            display.setEditable(false);
        });
        four.addActionListener(e->{
            if(!check.isEmpty()){
                sb.setLength(0);
                check.setLength(0);
            }
            if(sb.isEmpty()){
                sb.append("\n\n");
            }
            sb.append(4);
            display.setEditable(true);
            display.setText(sb.toString());
            display.setEditable(false);
        });
        five.addActionListener(e->{
            if(!check.isEmpty()){
                sb.setLength(0);
                check.setLength(0);
            }
            if(sb.isEmpty()){
                sb.append("\n\n");
            }
            sb.append(5);
            display.setEditable(true);
            display.setText(sb.toString());
            display.setEditable(false);
        });
        six.addActionListener(e->{
            if(!check.isEmpty()){
                sb.setLength(0);
                check.setLength(0);
            }
            if(sb.isEmpty()){
                sb.append("\n\n");
            }
            sb.append(6);
            display.setEditable(true);
            display.setText(sb.toString());
            display.setEditable(false);
        });
        seven.addActionListener(e->{
            if(!check.isEmpty()){
                sb.setLength(0);
                check.setLength(0);
            }
            if(sb.isEmpty()){
                sb.append("\n\n");
            }
            sb.append(7);
            display.setEditable(true);
            display.setText(sb.toString());
            display.setEditable(false);
        });
        eight.addActionListener(e->{
            if(!check.isEmpty()){
                sb.setLength(0);
                check.setLength(0);
            }
            if(sb.isEmpty()){
                sb.append("\n\n");
            }
            sb.append(8);
            display.setEditable(true);
            display.setText(sb.toString());
            display.setEditable(false);
        });
        nine.addActionListener(e->{
            if(!check.isEmpty()){
                sb.setLength(0);
                check.setLength(0);
            }
            if(sb.isEmpty()){
                sb.append("\n\n");
            }
            sb.append(9);
            display.setEditable(true);
            display.setText(sb.toString());
            display.setEditable(false);
        });
        dot.addActionListener(e->{
            if(!check.isEmpty()){
                sb.setLength(0);
                check.setLength(0);
            }
            if(sb.isEmpty()){
                sb.append("\n\n0");
            }
            if(sb.lastIndexOf(".") == -1 || sb.substring(sb.lastIndexOf(".")).contains("+") || sb.substring(sb.lastIndexOf(".")).contains("*") || sb.substring(sb.lastIndexOf(".")).contains("/") || sb.substring(sb.lastIndexOf(".")).contains("-")){
                if(sb.isEmpty()){
                    sb.append("\n\n");
                }
                if(!Character.isDigit(sb.charAt(sb.length()-1))){
                    sb.append(0);
                }
                sb.append(".");
                display.setEditable(true);
                display.setText(sb.toString());
                display.setEditable(false);
            }
        });
        boom.addActionListener(e->{
            check.setLength(0);
            if(!sb.isEmpty()){
                if(sb.charAt(sb.length()-1) == '.'){
                    sb.append(0);
                }
            }
            if(sb.indexOf("*") != -1 || sb.indexOf("-") != -1 || sb.indexOf("+") != -1 || sb.indexOf("/") != -1){
                parse(sb);
                sb.insert(0,"\n\n");
            }
            if(!sb.isEmpty()){
                if(Character.isDigit(sb.charAt(sb.length()-1)) || sb.charAt(sb.length()-1) == '.'){
                    sb.delete(0,2);
                    sb.append("\n+\n");
                    display.setEditable(true);
                    display.setText(sb.toString());
                    display.setEditable(false);
                }
                else{
                    while(!(Character.isDigit(sb.charAt(sb.length()-1)) || sb.charAt(sb.length()-1) == '.')){
                        sb.deleteCharAt(sb.length()-1);
                    }
                    sb.append("\n+\n");
                    sb.replace(sb.length()-1,sb.length(),"+");
                    display.setEditable(true);
                    display.setText(sb.toString());
                    display.setEditable(false);
                }
            }
        });
        minus.addActionListener(e->{
            check.setLength(0);
            if(!sb.isEmpty()){
                if(sb.charAt(sb.length()-1) == '.'){
                    sb.append(0);
                }
            }
            if(sb.indexOf("*") != -1 || sb.indexOf("-") != -1 || sb.indexOf("+") != -1 || sb.indexOf("/") != -1){
                parse(sb);
                sb.insert(0,"\n\n");
            }
            if(!sb.isEmpty()){
                if(Character.isDigit(sb.charAt(sb.length()-1)) || sb.charAt(sb.length()-1) == '.'){
                    sb.delete(0,2);
                    sb.append("\n-\n");
                    display.setEditable(true);
                    display.setText(sb.toString());
                    display.setEditable(false);
                }
                else{
                    while(!(Character.isDigit(sb.charAt(sb.length()-1)) || sb.charAt(sb.length()-1) == '.')){
                        sb.deleteCharAt(sb.length()-1);
                    }
                    sb.append("\n-\n");
                    display.setEditable(true);
                    display.setText(sb.toString());
                    display.setEditable(false);
                }
            }
        });
        multiply.addActionListener(e->{
            check.setLength(0);
            if(!sb.isEmpty()){
                if(sb.charAt(sb.length()-1) == '.'){
                    sb.append(0);
                }
            }
            if(sb.indexOf("*") != -1 || sb.indexOf("-") != -1 || sb.indexOf("+") != -1 || sb.indexOf("/") != -1){
                parse(sb);
                sb.insert(0,"\n\n");
            }
            if(!sb.isEmpty()){
                if(Character.isDigit(sb.charAt(sb.length()-1)) || sb.charAt(sb.length()-1) == '.'){
                    sb.delete(0,2);
                    sb.append("\n*\n");
                    display.setEditable(true);
                    display.setText(sb.toString());
                    display.setEditable(false);
                }
                else{
                    while(!(Character.isDigit(sb.charAt(sb.length()-1)) || sb.charAt(sb.length()-1) == '.')){
                        sb.deleteCharAt(sb.length()-1);
                    }
                    sb.append("\n*\n");
                    display.setEditable(true);
                    display.setText(sb.toString());
                    display.setEditable(false);
                }
            }
        });
        divide.addActionListener(e->{
            check.setLength(0);
            if(!sb.isEmpty()){
                if(sb.charAt(sb.length()-1) == '.'){
                    sb.append(0);
                }
            }
            if(sb.indexOf("*") != -1 || sb.indexOf("-") != -1 || sb.indexOf("+") != -1 || sb.indexOf("/") != -1){
                parse(sb);
                sb.insert(0,"\n\n");
            }
            if(!sb.isEmpty()){
                if(Character.isDigit(sb.charAt(sb.length()-1)) || sb.charAt(sb.length()-1) == '.'){
                    sb.delete(0,2);
                    sb.append("\n/\n");
                    display.setEditable(true);
                    display.setText(sb.toString());
                    display.setEditable(false);
                }
                else{
                    while(!(Character.isDigit(sb.charAt(sb.length()-1)) || sb.charAt(sb.length()-1) == '.')){
                        sb.deleteCharAt(sb.length()-1);
                    }
                    sb.append("\n/\n");
                    display.setEditable(true);
                    display.setText(sb.toString());
                    display.setEditable(false);
                }
            }
        });
        rocket.addActionListener(e->{
            if(!check.isEmpty()){
                sb.setLength(0);
                check.setLength(0);
            }
            sb.setLength(0);
            display.setEditable(true);
            display.setText(sb.toString());
            display.setEditable(false);
        });
        zero.addActionListener(e->{
            if(!check.isEmpty()){
                sb.setLength(0);
                check.setLength(0);
            }
            if(sb.isEmpty()){
                sb.append("\n\n");
            }
            sb.append(0);
            display.setEditable(true);
            display.setText(sb.toString());
            display.setEditable(false);
        });
        ok.addActionListener(e->{
            int I = sb.length()-1;
            if(!sb.isEmpty() && ((Character.isDigit(sb.charAt(I)) || sb.charAt(I) == '.'))){
                while(I > 0 && (Character.isDigit(sb.charAt(I)) || sb.charAt(I) == '.')){
                    --I;
                }
                if(sb.charAt(I) == '-'){
                    sb.deleteCharAt(I);
                }
                else {
                    sb.insert(I + 1, '-');
                }
                display.setEditable(true);
                display.setText(sb.toString());
                display.setEditable(false);
                if(!check.isEmpty()){
                    check.setLength(0);
                }
            }
        });
        equals.addActionListener(e->{
            if(Character.isDigit(sb.charAt(sb.length()-1)) || sb.charAt(sb.length()-1) == '.'){
                check.append("false");
                parse(sb);
                sb.insert(0,"\n\n");
                display.setEditable(true);
                display.setText(sb.toString());
                display.setEditable(false);
            }
        });
    }
}

