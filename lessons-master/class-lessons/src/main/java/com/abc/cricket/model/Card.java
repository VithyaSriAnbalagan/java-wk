package com.abc.cricket.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="CARD")
@Getter @Setter @ToString
public class Card {
	@Id
	@SequenceGenerator(name="SEQ_CARD")
	@Column(name="CARD")
	private int id;
	
    @Column(name="RUNS")
    private int runs;
	
    @Column(name="OVERS")
    private int overs;
	
    @Column(name="NO_WICKETS")
    private int numberOFWickets;
	
    @Column(name="NET_RUN_RATE")
    private int netRunRate;
    
       
   

	
	
	

}
