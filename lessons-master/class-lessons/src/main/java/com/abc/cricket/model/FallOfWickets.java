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
@Table(name="FALL_WKS")
@Getter @Setter @ToString
public class FallOfWickets {
	@Id
	@SequenceGenerator(name="SEQ_FOW")
	@Column(name="Fall_OF_WICKETS")
	private int fallOfWickets;
	
	@OneToOne
	@JoinColumn(name="PLAY_ID")
	private Player id;
	
    @Column(name="NO_WICKETS")
	private int numberOFWickets;
	
    @OneToOne
	@JoinColumn(name="BAT_ID")
	private Batsman batId;
    
    @OneToOne
	@JoinColumn(name="BOWL_ID")
	private Bowler bowlId;
	
	

}
