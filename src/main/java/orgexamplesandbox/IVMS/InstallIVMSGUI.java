package orgexamplesandbox.IVMS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class InstallIVMSGUI {
    public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> createAndShowGUI());
        }

        private static void createAndShowGUI() {
            JFrame frame = new JFrame("IVMS Installation Guide");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.getContentPane().add(panel);

            JLabel questionLabel = new JLabel("How to install IVMS?");
            panel.add(questionLabel);

            JButton answerButton = new JButton("Get Answer");
            panel.add(answerButton);

            answerButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    showAnswerDialog();
                }
            });

            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }

        private static void showAnswerDialog() {
            JOptionPane.showMessageDialog(null,
                    "To install IVMS, follow these steps:\n"
                            + "1. Download the IVMS installer from the official website.\n"
                            + "2. Run the installer and follow the on-screen instructions.\n"
                            + "3. Configure the settings as needed.\n"
                            + "4. Complete the installation process.\n"
                            + "5. Launch IVMS and log in with your credentials.",
                    "IVMS Installation Guide",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
