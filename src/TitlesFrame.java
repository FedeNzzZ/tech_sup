import javax.swing.SwingUtilities;
import java.awt.Component;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class TitlesFrame extends JFrame
{
    // конструктор класу TitlesFrame, який ініціалізує графічний інтерфейс користувача
    public TitlesFrame() {
        this.initUI();
    }
    
    // метод, який ініціалізує графічний інтерфейс користувача, встановлюючи заголовок вікна, розмір вікна та місцезнаходження вікна
    private void initUI() {
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel(78));  // конструктор класу TitlesPanel, який ініціалізує панель з анімацією кривих фігур зі затримкою delay
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }
    
    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                final TitlesFrame ps = new TitlesFrame();
                ps.setVisible(true);
            }
        });
    }
}
