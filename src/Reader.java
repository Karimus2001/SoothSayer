import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reader extends JFrame{
    JButton b1, b2;
    JLabel l1,l2;
    JTextField t1;
    String[] answers = {"Да!", "Нет!","Ещё не время.","Возможно.","Тебе стоит посоветоваться с самым близким человеком!",
    "Сто процентов!","Ты уверен, что хочешь это знать?","Подожди ещё неделю.","Ответ не известен!","Да прибудет с тобой сила!",
    "Много ты хочешь, братишка","Не на этой неделе!","Ладно, получишь в понедельник.","20 числа следующего месяца!",
    "Сначала наведи порядок в свой комнате.","Это сюрприз!","Берегись автомобиля!","Никто не знает.","Не скажу.",
    "Ой, да не приставай ко мне!","Для решения этого вопроса посоветуйся с Патриархом Кириллом, сын мой!"};
    
    int a = (int)(Math.random()*answers.length);
    
    public Reader(String s){
        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("Очистить");
        b2 = new JButton("Получить ответ");
        l1 = new JLabel("Задайте Ваш вопрос");
        //l2 = new JLabel(answers[a]);
        t1 = new JTextField(30);
        add(l1);
        add(t1);
        add(b2);
        add(b1);
    }
    
    public class eHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()== b2){
                l2 = new JLabel(answers[a]);
                add(l2);
            }
        }

    }
}
