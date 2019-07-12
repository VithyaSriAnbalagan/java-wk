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
@Table(name="INNINGS")
@Getter @Setter @ToString

public class Innings {
			
		@Id
		@SequenceGenerator(name="SEQ_INNS")
		@Column(name="RUNS")
		private int runs;
		
		@Column(name="OVER")
		private int overs;
		
		@Column(name="NO_WICKETS")
		private int numberOfWickets;
		
		@Column(name="NET_RUN_RATE")
		private double netRunRate;
		
		@Column(name="EXTRAS")
		private int extras;
		
	
	}

