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
@Table(name="TYPE_OUT")
@Getter @Setter @ToString
public class TypeOut {
	
	@Id
	@SequenceGenerator(name="SEQ_TYPEOUT")
	@Column(name="TYPE_OUT")
	private String outType;
	
	@OneToOne
    @JoinColumn(name="PLAY_ID",insertable=false,updatable=false)
    private Player playerId;
	
	@OneToOne
    @JoinColumn(name="BAT_ID")
    private Batsman batId;
	
	@OneToOne
	@JoinColumn(name="BOWL_ID")
	private Bowler bowlId;
	
	@OneToOne
    @JoinColumn(name="PLAY_ID")
	private Player fielderId;
	
}
