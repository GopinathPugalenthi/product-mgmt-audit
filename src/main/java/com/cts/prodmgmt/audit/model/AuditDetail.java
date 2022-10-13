package com.cts.prodmgmt.audit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Document("AuditDetail")
public class AuditDetail {
	private String action;
	private String AuditMessage;
	private String auctionEntity;
}
