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
@Table(name="BOWLER")
@Getter @Setter @ToString
public class Bowler {
	
	@Id
	@SequenceGenerator(name="SEQ_BOWL")
	@Column(name="BOWL_ID")
	private int bowlId;
	
	@OneToOne
    @JoinColumn(insertable=false,updatable=false)
    private Player player;
		
	@Column(name="OVERS")
	private int overs;
	
	@Column(name="MAIDENS")
	private int maidens;
	
	@Column(name="RUNS")
	private int runs;
	
	@Column(name="WICKETS")
	private int wickets;
	
	@Column(name="NO_BALLS")
	private int noBalls;
	
	@Column(name="WIDES")
	private int wides;
	
	@Column(name="ECONOMY")
	private double economy;
	
	
}
