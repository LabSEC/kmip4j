/**
 * OriginalCreationDate.java
 * -----------------------------------------------------------------
 *     __ __ __  ___________ 
 *    / //_//  |/  /  _/ __ \	  .--.
 *   / ,<  / /|_/ // // /_/ /	 /.-. '----------.
 *  / /| |/ /  / // // ____/ 	 \'-' .--"--""-"-'
 * /_/ |_/_/  /_/___/_/      	  '--'
 * 
 * -----------------------------------------------------------------
 * Description:
 * The Original Creation Date is the date and time when the Managed Object 
 * was first created or registered at the server. Introduced since kmip v1.1.
 *
 * @author     Lucas Perin <lucas.perin@posgrad.ufsc.br>
 * @org.       UFSC - Universidade Federal de Santa catarina
 * @copyright  Copyright © 2017, Lucas Perin
 * @license    Simplified BSD License (see LICENSE.TXT)
 *
 * 
 */

package ch.ntb.inf.kmip.attributes;

import ch.ntb.inf.kmip.kmipenum.EnumTag;
import ch.ntb.inf.kmip.kmipenum.EnumType;
import ch.ntb.inf.kmip.objects.base.Attribute;
import ch.ntb.inf.kmip.types.KMIPDateTime;
import ch.ntb.inf.kmip.types.KMIPTextString;
import ch.ntb.inf.kmip.types.KMIPType;


public class OriginalCreationDate extends Attribute {

	public OriginalCreationDate(){
		super(new KMIPTextString("Original Creation Date"), new EnumTag(EnumTag.OriginalCreationDate), new EnumType(EnumType.DateTime));
		this.values = new KMIPAttributeValue[1];
		this.values[0] = new KMIPAttributeValue(new EnumType(EnumType.DateTime), new EnumTag(EnumTag.OriginalCreationDate), new KMIPDateTime());
		this.values[0].setName(this.getAttributeName());
	}
	
	public OriginalCreationDate(KMIPType value){
		this();
		this.values[0].setValue(value);
	}
	
}
