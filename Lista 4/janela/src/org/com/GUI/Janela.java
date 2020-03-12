package org.com.GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

	public class Janela extends JFrame implements ActionListener{
		
		Calendar calendario = Calendar.getInstance();
		
		//obj botoes
		JButton btnMensagem = new JButton("Mensagem");
		JButton btnSair= new JButton("Sair");
		JButton btnNaoClique= new JButton("NÃO CLIQUE AQUI");
		//obj label///texto
		JLabel lblNome= new JLabel("Nome:");
		JLabel lblAnoDeNascimento= new JLabel("Ano de Nascimento:");
		//para escrever neles 
		JTextField txtNome = new JTextField();
		JTextField txtAnoDeNascimento = new JTextField();

		public Janela() {
			
			btnMensagem.addActionListener(this);
			btnSair.addActionListener(this);
			btnNaoClique.addActionListener(this);
			
			//BOTOES [JBUtton]
			setLayout(null);
			btnMensagem.setBounds(50,300,100,30);
			btnSair.setBounds(340, 300, 100, 30);
			btnNaoClique.setBounds(100,180,300,100);
		
			add(btnNaoClique);
			add(btnMensagem);
			add(btnSair);
			
			//LABEL[JLabel]
				lblNome.setBounds(30, 20, 100, 20);
				lblAnoDeNascimento.setBounds(30, 50, 140, 20);
			
				add(lblNome);
				add(lblAnoDeNascimento);
				
			//CAMPO DE TEXTO[JTextField]
				txtNome.setBounds(200,20 , 160, 25);
				txtAnoDeNascimento.setBounds(200,50 , 60, 25);
				
				add(txtNome);
				add(txtAnoDeNascimento);
				
			//JANELA [JFrame]
			setTitle("Cadrastro do produto");
			setSize(500, 400);
			setLocationRelativeTo(null);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnMensagem) {
				if(!txtNome.getText().equals("")) {
				try {  
				   String nome= txtNome.getText();
				   nome = nome.trim();
				   int Anodn=Integer.parseInt(txtAnoDeNascimento.getText());
			   
			      if(Anodn<1800||Anodn>2019) {
			    	  JOptionPane.showMessageDialog(null, "Digitou o ano errado...");
			      }else {
			      int Anoatual = calendario.get(Calendar.YEAR);
			      int idade = Anoatual-Anodn;
			      JOptionPane.showMessageDialog(null, "Seja Bem Vindo "+nome +" sua idade é "+idade);
			      
			      }}catch(Exception erro){
			    	  JOptionPane.showMessageDialog(null, "erro, mano fudeu............CORREEEEEEEEEE......................VAI EXPLODIR "); 
				   }}}
			else if(e.getSource() == btnSair){
				System.exit(0);
			}
			else if(e.getSource() == btnNaoClique) {
				while(true) {
				JOptionPane.showMessageDialog(null, "EU FALEI PRA NAO CLICAR CRALHOOOIO!!!!");
				}
			}
		}
		public static void main(String [] args) {
			new Janela();
		}
	}
	
	//public Janela() {
		//JFrame jf=new JFrame();
		//jf.setTitle("Quem é Vo$e?");
		//jf.setSize(500,600);
		//jf.setVisible(true);//torna a janela visivel
		//jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//pra desalocar espaço em memorio durante a ultilização de momoria ****tem que usar toda vez******
		//jf.setLocationRelativeTo(null);//torna a janela cetralizada 
		//jf.setResizable(true);//permitir que a janela seja ou nao redimensionavel }
		
	
	
//}
