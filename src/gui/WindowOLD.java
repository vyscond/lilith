
package gui;

import human_engine.Sudoku;

public class WindowOLD extends javax.swing.JFrame
{

	private Sudoku	sudoku;
	private String	selectednumber;
	private int			model	= 1;

	/** Creates new form Window */
	public WindowOLD()
	{

		initComponents();

		this.sudoku = new Sudoku(6, model);
		this.RefreshButtons();
		this.jTextAreaDefaultOutPut.setText("Bom Jogo!");
	}

	private void rebuild()
	{ 
		this.sudoku = new Sudoku(6, model);
		this.RefreshButtons();
		this.jTextAreaDefaultOutPut.setText("Bom Jogo!");
	}
	
	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt)
	{
		
		if (jComboBox1.getSelectedItem() == "modelo a")
		{
			this.model = 1;
		}
		else if (jComboBox1.getSelectedItem() == "modelo b")
		{
			this.model = 2;
		}

		this.rebuild();
	}

	private int setSelectedNumber()
	{
		if (jRadioButton1.isSelected())
		{
			this.selectednumber = "1";
		}
		else if (jRadioButton2.isSelected())
		{
			this.selectednumber = "2";
		}
		else if (jRadioButton3.isSelected())
		{
			this.selectednumber = "3";
		}
		else if (jRadioButton4.isSelected())
		{
			this.selectednumber = "4";
		}
		else if (jRadioButton5.isSelected())
		{
			this.selectednumber = "5";
		}
		else
		{
			this.selectednumber = "6";
		}

		return Integer.parseInt(this.selectednumber);
	}

	public void RefreshButtons()
	{
		this.jButton00.setText(this.sudoku.getValue(0, 0));
		this.jButton01.setText(this.sudoku.getValue(0, 1));
		this.jButton02.setText(this.sudoku.getValue(0, 2));
		this.jButton03.setText(this.sudoku.getValue(0, 3));
		this.jButton04.setText(this.sudoku.getValue(0, 4));
		this.jButton05.setText(this.sudoku.getValue(0, 5));
		this.jButton10.setText(this.sudoku.getValue(1, 0));
		this.jButton11.setText(this.sudoku.getValue(1, 1));
		this.jButton12.setText(this.sudoku.getValue(1, 2));
		this.jButton13.setText(this.sudoku.getValue(1, 3));
		this.jButton14.setText(this.sudoku.getValue(1, 4));
		this.jButton15.setText(this.sudoku.getValue(1, 5));
		this.jButton20.setText(this.sudoku.getValue(2, 0));
		this.jButton21.setText(this.sudoku.getValue(2, 1));
		this.jButton22.setText(this.sudoku.getValue(2, 2));
		this.jButton23.setText(this.sudoku.getValue(2, 3));
		this.jButton24.setText(this.sudoku.getValue(2, 4));
		this.jButton25.setText(this.sudoku.getValue(2, 5));
		this.jButton30.setText(this.sudoku.getValue(3, 0));
		this.jButton31.setText(this.sudoku.getValue(3, 1));
		this.jButton32.setText(this.sudoku.getValue(3, 2));
		this.jButton33.setText(this.sudoku.getValue(3, 3));
		this.jButton34.setText(this.sudoku.getValue(3, 4));
		this.jButton35.setText(this.sudoku.getValue(3, 5));
		this.jButton40.setText(this.sudoku.getValue(4, 0));
		this.jButton41.setText(this.sudoku.getValue(4, 1));
		this.jButton42.setText(this.sudoku.getValue(4, 2));
		this.jButton43.setText(this.sudoku.getValue(4, 3));
		this.jButton44.setText(this.sudoku.getValue(4, 4));
		this.jButton45.setText(this.sudoku.getValue(4, 5));
		this.jButton50.setText(this.sudoku.getValue(5, 0));
		this.jButton51.setText(this.sudoku.getValue(5, 1));
		this.jButton52.setText(this.sudoku.getValue(5, 2));
		this.jButton53.setText(this.sudoku.getValue(5, 3));
		this.jButton54.setText(this.sudoku.getValue(5, 4));
		this.jButton55.setText(this.sudoku.getValue(5, 5));

		this.jButton00.setBackground(this.sudoku.getColor(0, 0));
		this.jButton01.setBackground(this.sudoku.getColor(0, 1));
		this.jButton02.setBackground(this.sudoku.getColor(0, 2));
		this.jButton03.setBackground(this.sudoku.getColor(0, 3));
		this.jButton04.setBackground(this.sudoku.getColor(0, 4));
		this.jButton05.setBackground(this.sudoku.getColor(0, 5));
		this.jButton10.setBackground(this.sudoku.getColor(1, 0));
		this.jButton11.setBackground(this.sudoku.getColor(1, 1));
		this.jButton12.setBackground(this.sudoku.getColor(1, 2));
		this.jButton13.setBackground(this.sudoku.getColor(1, 3));
		this.jButton14.setBackground(this.sudoku.getColor(1, 4));
		this.jButton15.setBackground(this.sudoku.getColor(1, 5));
		this.jButton20.setBackground(this.sudoku.getColor(2, 0));
		this.jButton21.setBackground(this.sudoku.getColor(2, 1));
		this.jButton22.setBackground(this.sudoku.getColor(2, 2));
		this.jButton23.setBackground(this.sudoku.getColor(2, 3));
		this.jButton24.setBackground(this.sudoku.getColor(2, 4));
		this.jButton25.setBackground(this.sudoku.getColor(2, 5));
		this.jButton30.setBackground(this.sudoku.getColor(3, 0));
		this.jButton31.setBackground(this.sudoku.getColor(3, 1));
		this.jButton32.setBackground(this.sudoku.getColor(3, 2));
		this.jButton33.setBackground(this.sudoku.getColor(3, 3));
		this.jButton34.setBackground(this.sudoku.getColor(3, 4));
		this.jButton35.setBackground(this.sudoku.getColor(3, 5));
		this.jButton40.setBackground(this.sudoku.getColor(4, 0));
		this.jButton41.setBackground(this.sudoku.getColor(4, 1));
		this.jButton42.setBackground(this.sudoku.getColor(4, 2));
		this.jButton43.setBackground(this.sudoku.getColor(4, 3));
		this.jButton44.setBackground(this.sudoku.getColor(4, 4));
		this.jButton45.setBackground(this.sudoku.getColor(4, 5));
		this.jButton50.setBackground(this.sudoku.getColor(5, 0));
		this.jButton51.setBackground(this.sudoku.getColor(5, 1));
		this.jButton52.setBackground(this.sudoku.getColor(5, 2));
		this.jButton53.setBackground(this.sudoku.getColor(5, 3));
		this.jButton54.setBackground(this.sudoku.getColor(5, 4));
		this.jButton55.setBackground(this.sudoku.getColor(5, 5));
	}

	@SuppressWarnings("unchecked")// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents()
	{

		buttonGroup1 = new javax.swing.ButtonGroup();
		jPanel1 = new javax.swing.JPanel();
		jButton21 = new javax.swing.JButton();
		jButton02 = new javax.swing.JButton();
		jButton22 = new javax.swing.JButton();
		jButton01 = new javax.swing.JButton();
		jButton51 = new javax.swing.JButton();
		jButtonRenew = new javax.swing.JButton();
		jButton20 = new javax.swing.JButton();
		jButton00 = new javax.swing.JButton();
		jButton43 = new javax.swing.JButton();
		jButton23 = new javax.swing.JButton();
		jButton24 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jRadioButton6 = new javax.swing.JRadioButton();
		jRadioButton4 = new javax.swing.JRadioButton();
		jRadioButton5 = new javax.swing.JRadioButton();
		jButton12 = new javax.swing.JButton();
		jRadioButton3 = new javax.swing.JRadioButton();
		jButton11 = new javax.swing.JButton();
		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jButton42 = new javax.swing.JButton();
		jButton52 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jButton30 = new javax.swing.JButton();
		jButton04 = new javax.swing.JButton();
		jButton31 = new javax.swing.JButton();
		jButton03 = new javax.swing.JButton();
		jButton32 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jButton33 = new javax.swing.JButton();
		jButton34 = new javax.swing.JButton();
		jButton54 = new javax.swing.JButton();
		jButton40 = new javax.swing.JButton();
		jButton53 = new javax.swing.JButton();
		jButton44 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextAreaDefaultOutPut = new javax.swing.JTextArea();
		jButton10 = new javax.swing.JButton();
		jButton41 = new javax.swing.JButton();
		jButton50 = new javax.swing.JButton();
		jButton25 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jButton55 = new javax.swing.JButton();
		jButton35 = new javax.swing.JButton();
		jButton05 = new javax.swing.JButton();
		jButton45 = new javax.swing.JButton();
		jLabelHaroldKelvin = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Lilith's Sudoku");
		setBackground(new java.awt.Color(255, 255, 255));
		setForeground(java.awt.Color.white);
		setResizable(false);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jButton21.setBackground(new java.awt.Color(0, 0, 0));
		jButton21.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton21.setForeground(new java.awt.Color(66, 178, 255));
		jButton21.setBorder(null);
		jButton21.setBorderPainted(false);
		jButton21.setFocusPainted(false);
		jButton21.setFocusable(false);
		jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton21.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton21.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton21ActionPerformed(evt);
			}
		});

		jButton02.setBackground(new java.awt.Color(0, 0, 0));
		jButton02.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton02.setForeground(new java.awt.Color(66, 178, 255));
		jButton02.setBorder(null);
		jButton02.setBorderPainted(false);
		jButton02.setFocusPainted(false);
		jButton02.setFocusable(false);
		jButton02.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton02.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton02.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton02ActionPerformed(evt);
			}
		});

		jButton22.setBackground(new java.awt.Color(0, 0, 0));
		jButton22.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton22.setForeground(new java.awt.Color(66, 178, 255));
		jButton22.setBorder(null);
		jButton22.setBorderPainted(false);
		jButton22.setFocusPainted(false);
		jButton22.setFocusable(false);
		jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton22.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton22.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton22ActionPerformed(evt);
			}
		});

		jButton01.setBackground(new java.awt.Color(0, 0, 0));
		jButton01.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton01.setForeground(new java.awt.Color(66, 178, 255));
		jButton01.setBorder(null);
		jButton01.setBorderPainted(false);
		jButton01.setFocusPainted(false);
		jButton01.setFocusable(false);
		jButton01.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton01.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton01.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton01ActionPerformed(evt);
			}
		});

		jButton51.setBackground(new java.awt.Color(0, 0, 0));
		jButton51.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton51.setForeground(new java.awt.Color(66, 178, 255));
		jButton51.setBorder(null);
		jButton51.setBorderPainted(false);
		jButton51.setFocusPainted(false);
		jButton51.setFocusable(false);
		jButton51.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton51.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton51.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton51ActionPerformed(evt);
			}
		});

		jButtonRenew.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
		jButtonRenew.setText("refazer");
		jButtonRenew.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButtonRenewActionPerformed(evt);
			}
		});

		jButton20.setBackground(new java.awt.Color(0, 0, 0));
		jButton20.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton20.setForeground(new java.awt.Color(66, 178, 255));
		jButton20.setBorder(null);
		jButton20.setBorderPainted(false);
		jButton20.setFocusPainted(false);
		jButton20.setFocusable(false);
		jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton20.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton20.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton20ActionPerformed(evt);
			}
		});

		jButton00.setBackground(new java.awt.Color(0, 0, 0));
		jButton00.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton00.setForeground(new java.awt.Color(66, 178, 255));
		jButton00.setBorder(null);
		jButton00.setBorderPainted(false);
		jButton00.setFocusPainted(false);
		jButton00.setFocusable(false);
		jButton00.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton00.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton00.setPreferredSize(new java.awt.Dimension(20, 20));
		jButton00.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton00ActionPerformed(evt);
			}
		});

		jButton43.setBackground(new java.awt.Color(0, 0, 0));
		jButton43.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton43.setForeground(new java.awt.Color(66, 178, 255));
		jButton43.setBorder(null);
		jButton43.setBorderPainted(false);
		jButton43.setFocusPainted(false);
		jButton43.setFocusable(false);
		jButton43.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton43.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton43.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton43ActionPerformed(evt);
			}
		});

		jButton23.setBackground(new java.awt.Color(0, 0, 0));
		jButton23.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton23.setForeground(new java.awt.Color(66, 178, 255));
		jButton23.setBorder(null);
		jButton23.setBorderPainted(false);
		jButton23.setFocusPainted(false);
		jButton23.setFocusable(false);
		jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton23.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton23.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton23ActionPerformed(evt);
			}
		});

		jButton24.setBackground(new java.awt.Color(0, 0, 0));
		jButton24.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton24.setForeground(new java.awt.Color(66, 178, 255));
		jButton24.setBorder(null);
		jButton24.setBorderPainted(false);
		jButton24.setFocusPainted(false);
		jButton24.setFocusable(false);
		jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton24.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton24.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton24ActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Monospaced", 0, 10));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("agora clique no quadrado desejado");

		jLabel1.setFont(new java.awt.Font("Monospaced", 0, 10));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Selecione o valor desejado");

		jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
		buttonGroup1.add(jRadioButton6);
		jRadioButton6.setFont(new java.awt.Font("Monospaced", 0, 10));
		jRadioButton6.setText("6");

		jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
		buttonGroup1.add(jRadioButton4);
		jRadioButton4.setFont(new java.awt.Font("Monospaced", 0, 10));
		jRadioButton4.setText("4");

		jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
		buttonGroup1.add(jRadioButton5);
		jRadioButton5.setFont(new java.awt.Font("Monospaced", 0, 10));
		jRadioButton5.setText("5");

		jButton12.setBackground(new java.awt.Color(0, 0, 0));
		jButton12.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton12.setForeground(new java.awt.Color(66, 178, 255));
		jButton12.setBorder(null);
		jButton12.setBorderPainted(false);
		jButton12.setFocusPainted(false);
		jButton12.setFocusable(false);
		jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton12.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton12.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton12ActionPerformed(evt);
			}
		});

		jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
		buttonGroup1.add(jRadioButton3);
		jRadioButton3.setFont(new java.awt.Font("Monospaced", 0, 10));
		jRadioButton3.setText("3");

		jButton11.setBackground(new java.awt.Color(0, 0, 0));
		jButton11.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton11.setForeground(new java.awt.Color(66, 178, 255));
		jButton11.setBorder(null);
		jButton11.setBorderPainted(false);
		jButton11.setFocusPainted(false);
		jButton11.setFocusable(false);
		jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton11.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton11.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton11ActionPerformed(evt);
			}
		});

		jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
		buttonGroup1.add(jRadioButton1);
		jRadioButton1.setFont(new java.awt.Font("Monospaced", 0, 10));
		jRadioButton1.setText("1");

		jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
		buttonGroup1.add(jRadioButton2);
		jRadioButton2.setFont(new java.awt.Font("Monospaced", 0, 10));
		jRadioButton2.setText("2");

		jButton42.setBackground(new java.awt.Color(0, 0, 0));
		jButton42.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton42.setForeground(new java.awt.Color(66, 178, 255));
		jButton42.setBorder(null);
		jButton42.setBorderPainted(false);
		jButton42.setFocusPainted(false);
		jButton42.setFocusable(false);
		jButton42.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton42.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton42.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton42ActionPerformed(evt);
			}
		});

		jButton52.setBackground(new java.awt.Color(0, 0, 0));
		jButton52.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton52.setForeground(new java.awt.Color(66, 178, 255));
		jButton52.setBorder(null);
		jButton52.setBorderPainted(false);
		jButton52.setFocusPainted(false);
		jButton52.setFocusable(false);
		jButton52.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton52.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton52.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton52ActionPerformed(evt);
			}
		});

		jButton13.setBackground(new java.awt.Color(0, 0, 0));
		jButton13.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton13.setForeground(new java.awt.Color(66, 178, 255));
		jButton13.setBorder(null);
		jButton13.setBorderPainted(false);
		jButton13.setFocusPainted(false);
		jButton13.setFocusable(false);
		jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton13.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton13.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton13ActionPerformed(evt);
			}
		});

		jButton30.setBackground(new java.awt.Color(0, 0, 0));
		jButton30.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton30.setForeground(new java.awt.Color(66, 178, 255));
		jButton30.setBorder(null);
		jButton30.setBorderPainted(false);
		jButton30.setFocusPainted(false);
		jButton30.setFocusable(false);
		jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton30.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton30.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton30ActionPerformed(evt);
			}
		});

		jButton04.setBackground(new java.awt.Color(0, 0, 0));
		jButton04.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton04.setForeground(new java.awt.Color(66, 178, 255));
		jButton04.setBorder(null);
		jButton04.setBorderPainted(false);
		jButton04.setFocusPainted(false);
		jButton04.setFocusable(false);
		jButton04.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton04.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton04.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton04ActionPerformed(evt);
			}
		});

		jButton31.setBackground(new java.awt.Color(0, 0, 0));
		jButton31.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton31.setForeground(new java.awt.Color(66, 178, 255));
		jButton31.setBorder(null);
		jButton31.setBorderPainted(false);
		jButton31.setFocusPainted(false);
		jButton31.setFocusable(false);
		jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton31.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton31.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton31ActionPerformed(evt);
			}
		});

		jButton03.setBackground(new java.awt.Color(0, 0, 0));
		jButton03.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton03.setForeground(new java.awt.Color(66, 178, 255));
		jButton03.setBorder(null);
		jButton03.setBorderPainted(false);
		jButton03.setFocusPainted(false);
		jButton03.setFocusable(false);
		jButton03.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton03.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton03.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton03ActionPerformed(evt);
			}
		});

		jButton32.setBackground(new java.awt.Color(0, 0, 0));
		jButton32.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton32.setForeground(new java.awt.Color(66, 178, 255));
		jButton32.setBorder(null);
		jButton32.setBorderPainted(false);
		jButton32.setFocusPainted(false);
		jButton32.setFocusable(false);
		jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton32.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton32.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton32ActionPerformed(evt);
			}
		});

		jButton14.setBackground(new java.awt.Color(0, 0, 0));
		jButton14.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton14.setForeground(new java.awt.Color(66, 178, 255));
		jButton14.setBorder(null);
		jButton14.setBorderPainted(false);
		jButton14.setFocusPainted(false);
		jButton14.setFocusable(false);
		jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton14.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton14.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton14ActionPerformed(evt);
			}
		});

		jButton33.setBackground(new java.awt.Color(0, 0, 0));
		jButton33.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton33.setForeground(new java.awt.Color(66, 178, 255));
		jButton33.setBorder(null);
		jButton33.setBorderPainted(false);
		jButton33.setFocusPainted(false);
		jButton33.setFocusable(false);
		jButton33.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton33.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton33.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton33ActionPerformed(evt);
			}
		});

		jButton34.setBackground(new java.awt.Color(0, 0, 0));
		jButton34.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton34.setForeground(new java.awt.Color(66, 178, 255));
		jButton34.setBorder(null);
		jButton34.setBorderPainted(false);
		jButton34.setFocusPainted(false);
		jButton34.setFocusable(false);
		jButton34.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton34.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton34.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton34ActionPerformed(evt);
			}
		});

		jButton54.setBackground(new java.awt.Color(0, 0, 0));
		jButton54.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton54.setForeground(new java.awt.Color(66, 178, 255));
		jButton54.setBorder(null);
		jButton54.setBorderPainted(false);
		jButton54.setFocusPainted(false);
		jButton54.setFocusable(false);
		jButton54.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton54.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton54.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton54ActionPerformed(evt);
			}
		});

		jButton40.setBackground(new java.awt.Color(0, 0, 0));
		jButton40.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton40.setForeground(new java.awt.Color(66, 178, 255));
		jButton40.setBorder(null);
		jButton40.setBorderPainted(false);
		jButton40.setFocusPainted(false);
		jButton40.setFocusable(false);
		jButton40.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton40.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton40.setPreferredSize(new java.awt.Dimension(20, 20));
		jButton40.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton40ActionPerformed(evt);
			}
		});

		jButton53.setBackground(new java.awt.Color(0, 0, 0));
		jButton53.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton53.setForeground(new java.awt.Color(66, 178, 255));
		jButton53.setBorder(null);
		jButton53.setBorderPainted(false);
		jButton53.setFocusPainted(false);
		jButton53.setFocusable(false);
		jButton53.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton53.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton53.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton53ActionPerformed(evt);
			}
		});

		jButton44.setBackground(new java.awt.Color(0, 0, 0));
		jButton44.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton44.setForeground(new java.awt.Color(66, 178, 255));
		jButton44.setBorder(null);
		jButton44.setBorderPainted(false);
		jButton44.setFocusPainted(false);
		jButton44.setFocusable(false);
		jButton44.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton44.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton44.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton44ActionPerformed(evt);
			}
		});

		jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

		jTextAreaDefaultOutPut.setColumns(20);
		jTextAreaDefaultOutPut.setEditable(false);
		jTextAreaDefaultOutPut.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
		jTextAreaDefaultOutPut.setLineWrap(true);
		jTextAreaDefaultOutPut.setRows(5);
		jTextAreaDefaultOutPut.setWrapStyleWord(true);
		jScrollPane1.setViewportView(jTextAreaDefaultOutPut);

		jButton10.setBackground(new java.awt.Color(0, 0, 0));
		jButton10.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton10.setForeground(new java.awt.Color(66, 178, 255));
		jButton10.setBorder(null);
		jButton10.setBorderPainted(false);
		jButton10.setFocusPainted(false);
		jButton10.setFocusable(false);
		jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton10.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton10.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton10ActionPerformed(evt);
			}
		});

		jButton41.setBackground(new java.awt.Color(0, 0, 0));
		jButton41.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton41.setForeground(new java.awt.Color(66, 178, 255));
		jButton41.setBorder(null);
		jButton41.setBorderPainted(false);
		jButton41.setFocusPainted(false);
		jButton41.setFocusable(false);
		jButton41.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton41.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton41.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton41ActionPerformed(evt);
			}
		});

		jButton50.setBackground(new java.awt.Color(0, 0, 0));
		jButton50.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton50.setForeground(new java.awt.Color(66, 178, 255));
		jButton50.setBorder(null);
		jButton50.setBorderPainted(false);
		jButton50.setFocusPainted(false);
		jButton50.setFocusable(false);
		jButton50.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton50.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton50.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton50ActionPerformed(evt);
			}
		});

		jButton25.setBackground(new java.awt.Color(0, 0, 0));
		jButton25.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton25.setForeground(new java.awt.Color(66, 178, 255));
		jButton25.setBorder(null);
		jButton25.setBorderPainted(false);
		jButton25.setFocusPainted(false);
		jButton25.setFocusable(false);
		jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton25.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton25.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton25ActionPerformed(evt);
			}
		});

		jButton15.setBackground(new java.awt.Color(0, 0, 0));
		jButton15.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton15.setForeground(new java.awt.Color(66, 178, 255));
		jButton15.setBorder(null);
		jButton15.setBorderPainted(false);
		jButton15.setFocusPainted(false);
		jButton15.setFocusable(false);
		jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton15.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton15.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton15ActionPerformed(evt);
			}
		});

		jButton55.setBackground(new java.awt.Color(0, 0, 0));
		jButton55.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton55.setForeground(new java.awt.Color(66, 178, 255));
		jButton55.setBorder(null);
		jButton55.setBorderPainted(false);
		jButton55.setFocusPainted(false);
		jButton55.setFocusable(false);
		jButton55.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton55.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton55.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton55ActionPerformed(evt);
			}
		});

		jButton35.setBackground(new java.awt.Color(0, 0, 0));
		jButton35.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton35.setForeground(new java.awt.Color(66, 178, 255));
		jButton35.setBorder(null);
		jButton35.setBorderPainted(false);
		jButton35.setFocusPainted(false);
		jButton35.setFocusable(false);
		jButton35.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton35.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton35.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton35ActionPerformed(evt);
			}
		});

		jButton05.setBackground(new java.awt.Color(0, 0, 0));
		jButton05.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton05.setForeground(new java.awt.Color(66, 178, 255));
		jButton05.setBorder(null);
		jButton05.setBorderPainted(false);
		jButton05.setFocusPainted(false);
		jButton05.setFocusable(false);
		jButton05.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton05.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton05.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton05ActionPerformed(evt);
			}
		});

		jButton45.setBackground(new java.awt.Color(0, 0, 0));
		jButton45.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
		jButton45.setForeground(new java.awt.Color(66, 178, 255));
		jButton45.setBorder(null);
		jButton45.setBorderPainted(false);
		jButton45.setFocusPainted(false);
		jButton45.setFocusable(false);
		jButton45.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
		jButton45.setMargin(new java.awt.Insets(1, 1, 1, 1));
		jButton45.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton45ActionPerformed(evt);
			}
		});

		jLabelHaroldKelvin.setFont(new java.awt.Font("Monospaced", 0, 10));
		jLabelHaroldKelvin.setForeground(new java.awt.Color(153, 0, 204));
		jLabelHaroldKelvin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabelHaroldKelvin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/succubus_chibi_80_80.jpg"))); // NOI18N

		jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 3, 12));
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("Recado da Lilith");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "modelo a", "modelo b" }));
		jComboBox1.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jComboBox1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout
						.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout.createSequentialGroup().addComponent(jButtonRenew).addGap(34, 34, 34).addComponent(jComboBox1, 0, 105, Short.MAX_VALUE))
										.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout.createSequentialGroup().addGap(6, 6, 6).addComponent(jRadioButton1)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton2)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton3)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton4)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton5)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton6).addGap(14, 14, 14))
										.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createSequentialGroup()
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(
																				jPanel1Layout.createSequentialGroup().addGap(60, 60, 60)
																						.addComponent(jButton02, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				jPanel1Layout.createSequentialGroup()
																						.addComponent(jButton00, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(jButton01, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				jPanel1Layout.createSequentialGroup()
																						.addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(
																				jPanel1Layout.createSequentialGroup()
																						.addComponent(jButton03, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(jButton04, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				jPanel1Layout.createSequentialGroup()
																						.addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(
																jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jButton05, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(
												jPanel1Layout.createSequentialGroup()
														.addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
														.addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(
												jPanel1Layout.createSequentialGroup().addGap(182, 182, 182)
														.addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(
												jPanel1Layout.createSequentialGroup().addGap(122, 122, 122)
														.addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(30, 30, 30))
										.addGroup(
												jPanel1Layout.createSequentialGroup()
														.addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(
												jPanel1Layout
														.createSequentialGroup()
														.addGap(182, 182, 182)
														.addGroup(
																jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(
												jPanel1Layout.createSequentialGroup().addGap(122, 122, 122)
														.addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(30, 30, 30))
										.addGroup(
												jPanel1Layout.createSequentialGroup().addGap(122, 122, 122)
														.addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(30, 30, 30))
										.addGroup(
												jPanel1Layout.createSequentialGroup()
														.addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(
												jPanel1Layout.createSequentialGroup()
														.addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(
												jPanel1Layout.createSequentialGroup().addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabelHaroldKelvin))).addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						jPanel1Layout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jRadioButton3).addComponent(jRadioButton4)
												.addComponent(jRadioButton5).addComponent(jRadioButton2).addComponent(jRadioButton1).addComponent(jRadioButton6))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabel2)
								.addGap(15, 15, 15)
								.addGroup(
										jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														jPanel1Layout
																.createSequentialGroup()
																.addGroup(
																		jPanel1Layout
																				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																				.addComponent(jButton02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																				.addComponent(jButton01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																				.addComponent(jButton00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																				.addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																				.addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
																				.addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(18, 18, 18)
																.addGroup(
																		jPanel1Layout
																				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGroup(
																						jPanel1Layout
																								.createSequentialGroup()
																								.addGap(1, 1, 1)
																								.addGroup(
																										jPanel1Layout
																												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
																														javax.swing.GroupLayout.PREFERRED_SIZE)))))
												.addGroup(
														jPanel1Layout
																.createSequentialGroup()
																.addGroup(
																		jPanel1Layout
																				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																								.addComponent(jButton03, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
																								.addComponent(jButton04, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addComponent(jButton05, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGap(8, 8, 8)
								.addGroup(
										jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														jPanel1Layout.createSequentialGroup()
																.addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														jPanel1Layout
																.createSequentialGroup()
																.addGroup(
																		jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														jPanel1Layout
																.createSequentialGroup()
																.addGroup(
																		jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabelHaroldKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(22, 22, 22)
								.addGroup(
										jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jButtonRenew, 0, 0, Short.MAX_VALUE)
												.addComponent(jComboBox1)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButtonRenewActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.rebuild();

	}

	private void jButton00ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 0, 0));
		this.jButton00.setText(this.sudoku.getValue(0, 0));
		
	}

	private void jButton01ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 0, 1));
		this.jButton01.setText(this.sudoku.getValue(0, 1));
	}

	private void jButton02ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 0, 2));
		this.jButton02.setText(this.sudoku.getValue(0, 2));
	}

	private void jButton03ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 0, 3));
		this.jButton03.setText(this.sudoku.getValue(0, 3));
	}

	private void jButton04ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 0, 4));
		this.jButton04.setText(this.sudoku.getValue(0, 4));
	}
	
	private void jButton05ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 0, 5));
		this.jButton05.setText(this.sudoku.getValue(0, 5));
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 1, 0));
		this.jButton10.setText(this.sudoku.getValue(1, 0));
	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 1, 1));
		this.jButton11.setText(this.sudoku.getValue(1, 1));
	}

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 1, 2));
		this.jButton12.setText(this.sudoku.getValue(1, 2));
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 1, 3));
		this.jButton13.setText(this.sudoku.getValue(1, 3));
	}

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 1, 4));
		this.jButton14.setText(this.sudoku.getValue(1, 4));
	}

	private void jButton15ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 1, 5));
		this.jButton15.setText(this.sudoku.getValue(1, 5));
	}

	private void jButton20ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 2, 0));
		this.jButton20.setText(this.sudoku.getValue(2, 0));
	}

	private void jButton21ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 2, 1));
		this.jButton21.setText(this.sudoku.getValue(2, 1));
	}

	private void jButton22ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 2, 2));
		this.jButton22.setText(this.sudoku.getValue(2, 2));
	}

	private void jButton23ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 2, 3));
		this.jButton23.setText(this.sudoku.getValue(2, 3));
	}

	private void jButton24ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 2, 4));
		this.jButton24.setText(this.sudoku.getValue(2, 4));
	}

	private void jButton25ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 2, 5));
		this.jButton25.setText(this.sudoku.getValue(2, 5));
	}

	private void jButton30ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 3, 0));
		this.jButton30.setText(this.sudoku.getValue(3, 0));
	}

	private void jButton31ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 3, 1));
		this.jButton31.setText(this.sudoku.getValue(3, 1));
	}

	private void jButton32ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 3, 2));
		this.jButton32.setText(this.sudoku.getValue(3, 2));
	}

	private void jButton33ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 3, 3));
		this.jButton33.setText(this.sudoku.getValue(3, 3));
	}

	private void jButton34ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 3, 4));
		this.jButton34.setText(this.sudoku.getValue(3, 4));
	}

	private void jButton35ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 3, 5));
		this.jButton35.setText(this.sudoku.getValue(3, 5));
	}

	private void jButton40ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 4, 0));
		this.jButton40.setText(this.sudoku.getValue(4, 0));
	}

	private void jButton41ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 4, 1));
		this.jButton41.setText(this.sudoku.getValue(4, 1));
	}

	private void jButton42ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 4, 2));
		this.jButton42.setText(this.sudoku.getValue(4, 2));
	}

	private void jButton43ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 4, 3));
		this.jButton43.setText(this.sudoku.getValue(4, 3));
	}

	private void jButton44ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 4, 4));
		this.jButton44.setText(this.sudoku.getValue(4, 4));
	}

	private void jButton45ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 4, 5));
		this.jButton45.setText(this.sudoku.getValue(4, 5));
	}

	private void jButton50ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 5, 0));
		this.jButton50.setText(this.sudoku.getValue(5, 0));
	}

	private void jButton51ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 5, 1));
		this.jButton51.setText(this.sudoku.getValue(5, 1));
	}

	private void jButton52ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 5, 2));
		this.jButton52.setText(this.sudoku.getValue(5, 2));
	}

	private void jButton53ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 5, 3));
		this.jButton53.setText(this.sudoku.getValue(5, 3));
	}

	private void jButton54ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 5, 4));
		this.jButton54.setText(this.sudoku.getValue(5, 4));
	}

	private void jButton55ActionPerformed(java.awt.event.ActionEvent evt)
	{
		this.jTextAreaDefaultOutPut.setText(this.sudoku.fill(this.setSelectedNumber(), 5, 5));
		this.jButton55.setText(this.sudoku.getValue(5, 5));
	}

	public static void main(String args[])
	{
		java.awt.EventQueue.invokeLater(new Runnable()
		{

			@Override public void run()
			{
				new WindowOLD().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.ButtonGroup		buttonGroup1;
	private javax.swing.JButton				jButton00;
	private javax.swing.JButton				jButton01;
	private javax.swing.JButton				jButton02;
	private javax.swing.JButton				jButton03;
	private javax.swing.JButton				jButton04;
	private javax.swing.JButton				jButton05;
	private javax.swing.JButton				jButton10;
	private javax.swing.JButton				jButton11;
	private javax.swing.JButton				jButton12;
	private javax.swing.JButton				jButton13;
	private javax.swing.JButton				jButton14;
	private javax.swing.JButton				jButton15;
	private javax.swing.JButton				jButton20;
	private javax.swing.JButton				jButton21;
	private javax.swing.JButton				jButton22;
	private javax.swing.JButton				jButton23;
	private javax.swing.JButton				jButton24;
	private javax.swing.JButton				jButton25;
	private javax.swing.JButton				jButton30;
	private javax.swing.JButton				jButton31;
	private javax.swing.JButton				jButton32;
	private javax.swing.JButton				jButton33;
	private javax.swing.JButton				jButton34;
	private javax.swing.JButton				jButton35;
	private javax.swing.JButton				jButton40;
	private javax.swing.JButton				jButton41;
	private javax.swing.JButton				jButton42;
	private javax.swing.JButton				jButton43;
	private javax.swing.JButton				jButton44;
	private javax.swing.JButton				jButton45;
	private javax.swing.JButton				jButton50;
	private javax.swing.JButton				jButton51;
	private javax.swing.JButton				jButton52;
	private javax.swing.JButton				jButton53;
	private javax.swing.JButton				jButton54;
	private javax.swing.JButton				jButton55;
	private javax.swing.JButton				jButtonRenew;
	private javax.swing.JComboBox			jComboBox1;
	private javax.swing.JLabel				jLabel1;
	private javax.swing.JLabel				jLabel2;
	private javax.swing.JLabel				jLabel3;
	private javax.swing.JLabel				jLabelHaroldKelvin;
	private javax.swing.JPanel				jPanel1;
	private javax.swing.JRadioButton	jRadioButton1;
	private javax.swing.JRadioButton	jRadioButton2;
	private javax.swing.JRadioButton	jRadioButton3;
	private javax.swing.JRadioButton	jRadioButton4;
	private javax.swing.JRadioButton	jRadioButton5;
	private javax.swing.JRadioButton	jRadioButton6;
	private javax.swing.JScrollPane		jScrollPane1;
	private javax.swing.JTextArea			jTextAreaDefaultOutPut;
}
