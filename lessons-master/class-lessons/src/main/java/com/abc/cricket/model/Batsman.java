package com.abc.cricket.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="BATSMAN")
@Getter @Setter @ToString
public class Batsman {
	@Id
	@SequenceGenerator(name="SEQ_BATSMAN")
	@Column(name="BAT_ID")
	private int batId;
	
	@OneToOne
    @JoinColumn(name="PLAY_ID")
    private Player player;
	
	@Column(name="NUM_6")
	private int numberOfSixes;
	
	@Column(name="NUM_4")
	private int numberOfFours;
	
	@Column(name="STRIKE_RATE")
	private double strikeRate;
	
	@Column(name="SCORE")
	private int score;
	

	
	
	

}
