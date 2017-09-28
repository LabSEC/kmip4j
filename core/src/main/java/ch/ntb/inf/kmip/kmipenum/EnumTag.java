/**
 * EnumTag.java
 * -----------------------------------------------------------------
 *     __ __ __  ___________ 
 *    / //_//  |/  /  _/ __ \	  .--.
 *   / ,<  / /|_/ // // /_/ /	 /.-. '----------.
 *  / /| |/ /  / // // ____/ 	 \'-' .--"--""-"-'
 * /_/ |_/_/  /_/___/_/      	  '--'
 * 
 * -----------------------------------------------------------------
 * Description for class
 * Concrete KMIPEnumeration: Tags
 *
 * @author     Stefanie Meile <stefaniemeile@gmail.com>
 * @author     Michael Guster <michael.guster@gmail.com>
 * @org.       NTB - University of Applied Sciences Buchs, (CH)
 * @copyright  Copyright ï¿½ 2013, Stefanie Meile, Michael Guster
 * @license    Simplified BSD License (see LICENSE.TXT)
 * @version    1.0, 2013/08/09
 * @since      Class available since Release 1.0
 *
 * 
 */
package ch.ntb.inf.kmip.kmipenum;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;

import ch.ntb.inf.kmip.types.KMIPEnumeration;

public class EnumTag extends KMIPEnumeration{
	
	private static HashMap<String, Integer> values;
	
	public static final int Default		 	= -1;
	public static final int ActivationDate = 0x420001;
	public static final int ApplicationData = 0x420002;
	public static final int ApplicationNamespace = 0x420003;
	public static final int ApplicationSpecificInformation = 0x420004;
	public static final int ArchiveDate = 0x420005;
	public static final int AsynchronousCorrelationValue = 0x420006;
	public static final int AsynchronousIndicator = 0x420007;
	public static final int Attribute = 0x420008;
	public static final int AttributeIndex = 0x420009;
	public static final int AttributeName = 0x42000A;
	public static final int AttributeValue = 0x42000B;
	public static final int Authentication = 0x42000C;
	public static final int BatchCount = 0x42000D;
	public static final int BatchErrorContinuationOption = 0x42000E;
	public static final int BatchItem = 0x42000F;
	public static final int BatchOrderOption = 0x420010;
	public static final int BlockCipherMode = 0x420011;
	public static final int CancellationResult = 0x420012;
	public static final int Certificate = 0x420013;
	public static final int CertificateIdentifier = 0x420014;
	public static final int CertificateIssuer = 0x420015;
	public static final int CertificateIssuerAlternativeName = 0x420016;
	public static final int CertificateIssuerDistinguishedName = 0x420017;
	public static final int CertificateRequest = 0x420018;
	public static final int CertificateRequestType = 0x420019;
	public static final int CertificateSubject = 0x42001A;
	public static final int CertificateSubjectAlternativeName = 0x42001B;
	public static final int CertificateSubjectDistinguishedName = 0x42001C;
	public static final int CertificateType = 0x42001D;
	public static final int CertificateValue = 0x42001E;
	public static final int CommonTemplateAttribute = 0x42001F;
	public static final int CompromiseDate = 0x420020;
	public static final int CompromiseOccurrenceDate = 0x420021;
	public static final int ContactInformation = 0x420022;
	public static final int Credential = 0x420023;
	public static final int CredentialType = 0x420024;
	public static final int CredentialValue = 0x420025;
	public static final int CriticalityIndicator = 0x420026;
	public static final int CRTCoefficient = 0x420027;
	public static final int CryptographicAlgorithm = 0x420028;
	public static final int CryptographicDomainParameters = 0x420029;
	public static final int CryptographicLength = 0x42002A;
	public static final int CryptographicParameters = 0x42002B;
	public static final int CryptographicUsageMask = 0x42002C;
	public static final int CustomAttribute = 0x42002D;
	public static final int D = 0x42002E;
	public static final int DeactivationDate = 0x42002F;
	public static final int DerivationData = 0x420030;
	public static final int DerivationMethod = 0x420031;
	public static final int DerivationParameters = 0x420032;
	public static final int DestroyDate = 0x420033;
	public static final int Digest = 0x420034;
	public static final int DigestValue = 0x420035;
	public static final int EncryptionKeyInformation = 0x420036;
	public static final int G = 0x420037;
	public static final int HashingAlgorithm = 0x420038;
	public static final int InitialDate = 0x420039;
	public static final int InitializationVector = 0x42003A;
	public static final int Issuer = 0x42003B;
	public static final int IterationCount = 0x42003C;
	public static final int IVCounterNonce = 0x42003D;
	public static final int J = 0x42003E;
	public static final int Key = 0x42003F;
	public static final int KeyBlock = 0x420040;
	public static final int KeyCompressionType = 0x420041;
	public static final int KeyFormatType = 0x420042;
	public static final int KeyMaterial = 0x420043;
	public static final int KeyPartIdentifier = 0x420044;
	public static final int KeyValue = 0x420045;
	public static final int KeyWrappingData = 0x420046;
	public static final int KeyWrappingSpecification = 0x420047;
	public static final int LastChangeDate = 0x420048;
	public static final int LeaseTime = 0x420049;
	public static final int Link = 0x42004A;
	public static final int LinkType = 0x42004B;
	public static final int LinkedObjectIdentifier = 0x42004C;
	public static final int MACSignature = 0x42004D;
	public static final int MACSignatureKeyInformation = 0x42004E;
	public static final int MaximumItems = 0x42004F;
	public static final int MaximumResponseSize = 0x420050;
	public static final int MessageExtension = 0x420051;
	public static final int Modulus = 0x420052;
	public static final int Name = 0x420053;
	public static final int NameType = 0x420054;
	public static final int NameValue = 0x420055;
	public static final int ObjectGroup = 0x420056;
	public static final int ObjectType = 0x420057;
	public static final int Offset = 0x420058;
	public static final int OpaqueDataType = 0x420059;
	public static final int OpaqueDataValue = 0x42005A;
	public static final int OpaqueObject = 0x42005B;
	public static final int Operation = 0x42005C;
	public static final int OperationPolicyName = 0x42005D;
	public static final int P = 0x42005E;
	public static final int PaddingMethod = 0x42005F;
	public static final int PrimeExponentP = 0x420060;
	public static final int PrimeExponentQ = 0x420061;
	public static final int PrimeFieldSize = 0x420062;
	public static final int PrivateExponent = 0x420063;
	public static final int PrivateKey = 0x420064;
	public static final int PrivateKeyTemplateAttribute = 0x420065;
	public static final int PrivateKeyUniqueIdentifier = 0x420066;
	public static final int ProcessStartDate = 0x420067;
	public static final int ProtectStopDate = 0x420068;
	public static final int ProtocolVersion = 0x420069;
	public static final int ProtocolVersionMajor = 0x42006A;
	public static final int ProtocolVersionMinor = 0x42006B;
	public static final int PublicExponent = 0x42006C;
	public static final int PublicKey = 0x42006D;
	public static final int PublicKeyTemplateAttribute = 0x42006E;
	public static final int PublicKeyUniqueIdentifier = 0x42006F;
	public static final int PutFunction = 0x420070;
	public static final int Q = 0x420071;
	public static final int QString = 0x420072;
	public static final int Qlength = 0x420073;
	public static final int QueryFunction = 0x420074;
	public static final int RecommendedCurve = 0x420075;
	public static final int ReplacedUniqueIdentifier = 0x420076;
	public static final int RequestHeader = 0x420077;
	public static final int RequestMessage = 0x420078;
	public static final int RequestPayload = 0x420079;
	public static final int ResponseHeader = 0x42007A;
	public static final int ResponseMessage = 0x42007B;
	public static final int ResponsePayload = 0x42007C;
	public static final int ResultMessage = 0x42007D;
	public static final int ResultReason = 0x42007E;
	public static final int ResultStatus = 0x42007F;
	public static final int RevocationMessage = 0x420080;
	public static final int RevocationReason = 0x420081;
	public static final int RevocationReasonCode = 0x420082;
	public static final int KeyRoleType = 0x420083;
	public static final int Salt = 0x420084;
	public static final int SecretData = 0x420085;
	public static final int SecretDataType = 0x420086;
	public static final int SerialNumber = 0x420087;
	public static final int ServerInformation = 0x420088;
	public static final int SplitKey = 0x420089;
	public static final int SplitKeyMethod = 0x42008A;
	public static final int SplitKeyParts = 0x42008B;
	public static final int SplitKeyThreshold = 0x42008C;
	public static final int State = 0x42008D;
	public static final int StorageStatusMask = 0x42008E;
	public static final int SymmetricKey = 0x42008F;
	public static final int Template = 0x420090;
	public static final int TemplateAttribute = 0x420091;
	public static final int TimeStamp = 0x420092;
	public static final int UniqueBatchItemID = 0x420093;
	public static final int UniqueIdentifier = 0x420094;
	public static final int UsageLimits = 0x420095;
	public static final int UsageLimitsCount = 0x420096;
	public static final int UsageLimitsTotal = 0x420097;
	public static final int UsageLimitsUnit = 0x420098;
	public static final int Username = 0x420099;
	public static final int ValidityDate = 0x42009A;
	public static final int ValidityIndicator = 0x42009B;
	public static final int VendorExtension = 0x42009C;
	public static final int VendorIdentification = 0x42009D;
	public static final int WrappingMethod = 0x42009E;
	public static final int X = 0x42009F;
	public static final int Y = 0x4200A0;
	public static final int Password = 0x4200A1;
    public static final int DEVICE_IDENTIFIER                        = 0x4200A2;
    public static final int ENCODING_OPTION                          = 0x4200A3;
    public static final int EXTENSION_INFORMATION                    = 0x4200A4;
    public static final int EXTENSION_NAME                           = 0x4200A5;
    public static final int EXTENSION_TAG                            = 0x4200A6;
    public static final int EXTENSION_TYPE                           = 0x4200A7;
    public static final int FRESH                                    = 0x4200A8;
    public static final int MACHINE_IDENTIFIER                       = 0x4200A9;
    public static final int MEDIA_IDENTIFIER                         = 0x4200AA;
    public static final int NETWORK_IDENTIFIER                       = 0x4200AB;
    public static final int OBJECT_GROUP_MEMBER                      = 0x4200AC;
    public static final int CERTIFICATE_LENGTH                       = 0x4200AD;
    public static final int DIGITAL_SIGNATURE_ALGORITHM              = 0x4200AE;
    public static final int CERTIFICATE_SERIAL_NUMBER                = 0x4200AF;
    public static final int DEVICE_SERIAL_NUMBER                     = 0x4200B0;
    public static final int ISSUER_ALTERNATIVE_NAME                  = 0x4200B1;
    public static final int ISSUER_DISTINGUISHED_NAME                = 0x4200B2;
    public static final int SUBJECT_ALTERNATIVE_NAME                 = 0x4200B3;
    public static final int SUBJECT_DISTINGUISHED_NAME               = 0x4200B4;
    public static final int X_509_CERTIFICATE_IDENTIFER              = 0x4200B5;
    public static final int X_509_CERTIFICATE_ISSUER                 = 0x4200B6;
    public static final int X_509_CERTIFICATE_SUBJECT                = 0x4200B7;
    public static final int KEY_VALUE_LOCATION                       = 0x4200B8;
    public static final int KEY_VALUE_LOCATION_VALUE                 = 0x4200B9;
    public static final int KEY_VALUE_LOCATION_TYPE                  = 0x4200BA;
    public static final int KEY_VALUE_PRESENT                        = 0x4200BB;
    public static final int OriginalCreationDate = 0x4200BC;
    public static final int PGP_KEY                                  = 0x4200BD;
    public static final int PGP_KEY_VERSION                          = 0x4200BE;
    public static final int ALTERNATIVE_NAME                         = 0x4200BF;
    public static final int ALTERNATIVE_NAME_VALUE                   = 0x4200C0;
    public static final int ALTERNATIVE_NAME_TYPE                    = 0x4200C1;
    public static final int DATA                                     = 0x4200C2;
    public static final int SIGNATURE_DATA                           = 0x4200C3;
    public static final int DATA_LENGTH                              = 0x4200C4;
    public static final int RANDOM_IV                                = 0x4200C5;
    public static final int MAC_DATA                                 = 0x4200C6;
    public static final int ATTESTATION_TYPE                         = 0x4200C7;
    public static final int NONCE                                    = 0x4200C8;
    public static final int NONCE_ID                                 = 0x4200C9;
    public static final int NONCE_VALUE                              = 0x4200CA;
    public static final int ATTESTATION_MEASUREMENT                  = 0x4200CB;
    public static final int ATTESTATION_ASSERTION                    = 0x4200CC;
    public static final int IV_LENGTH                                = 0x4200CD;
    public static final int TAG_LENGTH                               = 0x4200CE;
    public static final int FIXED_FIELD_LENGTH                       = 0x4200CF;
    public static final int COUNTER_LENGTH                           = 0x4200D0;
    public static final int INITIAL_COUNTER_VALUE                    = 0x4200D1;
    public static final int INVOCATION_FIELD_LENGTH                  = 0x4200D2;
    public static final int ATTESTATION_CAPABLE_INDICATOR            = 0x4200D3;
    public static final int OFFSET_ITEMS                             = 0x4200D4;
    public static final int LOCATED_ITEMS                            = 0x4200D5;
    public static final int CORRELATION_VALUE                        = 0x4200D6;
    public static final int INIT_INDICATOR                           = 0x4200D7;
    public static final int FINAL_INDICATOR                          = 0x4200D8;
    public static final int RNG_PARAMETERS                           = 0x4200D9;
    public static final int RNG_ALGORITHM                            = 0x4200DA;
    public static final int DRBG_ALGORITHM                           = 0x4200DB;
    public static final int FIPS186_VARIATION                        = 0x4200DC;
    public static final int PREDICTION_RESISTANCE                    = 0x4200DD;
    public static final int RANDOM_NUMBER_GENERATOR                  = 0x4200DE;
    public static final int VALIDATION_INFORMATION                   = 0x4200DF;
    public static final int VALIDATION_AUTHORITY_TYPE                = 0x4200E0;
    public static final int VALIDATION_AUTHORITY_COUNTRY             = 0x4200E1;
    public static final int VALIDATION_AUTHORITY_URI                 = 0x4200E2;
    public static final int VALIDATION_VERSION_MAJOR                 = 0x4200E3;
    public static final int VALIDATION_VERSION_MINOR                 = 0x4200E4;
    public static final int VALIDATION_TYPE                          = 0x4200E5;
    public static final int VALIDATION_LEVEL                         = 0x4200E6;
    public static final int VALIDATION_CERTIFICATE_IDENTIFIER        = 0x4200E7;
    public static final int VALIDATION_CERTIFICATE_URI               = 0x4200E8;
    public static final int VALIDATION_VENDOR_URI                    = 0x4200E9;
    public static final int VALIDATION_PROFILE                       = 0x4200EA;
    public static final int PROFILE_INFORMATION                      = 0x4200EB;
    public static final int PROFILE_NAME                             = 0x4200EC;
    public static final int SERVER_URI                               = 0x4200ED;
    public static final int SERVER_PORT                              = 0x4200EE;
    public static final int STREAMING_CAPABILITY                     = 0x4200EF;
    public static final int ASYNCHRONOUS_CAPABILITY                  = 0x4200F0;
    public static final int ATTESTATION_CAPABILITY                   = 0x4200F1;
    public static final int UNWRAP_MODE                              = 0x4200F2;
    public static final int DESTROY_ACTION                           = 0x4200F3;
    public static final int SHREDDING_ALGORITHM                      = 0x4200F4;
    public static final int RNG_MODE                                 = 0x4200F5;
    public static final int CLIENT_REGISTRATION_METHOD               = 0x4200F6;
    public static final int CAPABILITY_INFORMATION                   = 0x4200F7;
    public static final int KEY_WRAP_TYPE                            = 0x4200F8;
    public static final int BATCH_UNDO_CAPABILITY                    = 0x4200F9;
    public static final int BATCH_CONTINUE_CAPABILITY                = 0x4200FA;
    public static final int PKCS12_FRIENDLY_NAME                     = 0x4200FB;
    public static final int DESCRIPTION                              = 0x4200FC;
    public static final int COMMENT                                  = 0x4200FD;
    public static final int AUTHENTICATED_ENCRYPTION_ADDITIONAL_DATA = 0x4200FE;
    public static final int AUTHENTICATED_ENCRYPTION_TAG             = 0x4200FF;
    public static final int SALT_LENGTH                              = 0x420100;
    public static final int MASK_GENERATOR                           = 0x420101;
    public static final int MASK_GENERATOR_HASHING_ALGORITHM         = 0x420102;
    public static final int P_SOURCE                                 = 0x420103;
    public static final int TRAILER_FIELD                            = 0x420104;
    public static final int CLIENT_CORRELATION_VALUE                 = 0x420105;
    public static final int SERVER_CORRELATION_VALUE                 = 0x420106;
    public static final int DIGESTED_DATA                            = 0x420107;
    public static final int CERTIFICATE_SUBJECT_CN                   = 0x420108;
    public static final int CERTIFICATE_SUBJECT_O                    = 0x420109;
    public static final int CERTIFICATE_SUBJECT_OU                   = 0x42010A;
    public static final int CERTIFICATE_SUBJECT_EMAIL                = 0x42010B;
    public static final int CERTIFICATE_SUBJECT_C                    = 0x42010C;
    public static final int CERTIFICATE_SUBJECT_ST                   = 0x42010D;
    public static final int CERTIFICATE_SUBJECT_L                    = 0x42010E;
    public static final int CERTIFICATE_SUBJECT_UID                  = 0x42010F;
    public static final int CERTIFICATE_SUBJECT_SERIAL_NUMBER        = 0x420110;
    public static final int CERTIFICATE_SUBJECT_TITLE                = 0x420111;
    public static final int CERTIFICATE_SUBJECT_DC                   = 0x420112;
    public static final int CERTIFICATE_SUBJECT_DN_QUALIFIER         = 0x420113;
    public static final int CERTIFICATE_ISSUER_CN                    = 0x420114;
    public static final int CERTIFICATE_ISSUER_O                     = 0x420115;
    public static final int CERTIFICATE_ISSUER_OU                    = 0x420116;
    public static final int CERTIFICATE_ISSUER_EMAIL                 = 0x420117;
    public static final int CERTIFICATE_ISSUER_C                     = 0x420118;
    public static final int CERTIFICATE_ISSUER_ST                    = 0x420119;
    public static final int CERTIFICATE_ISSUER_L                     = 0x42011A;
    public static final int CERTIFICATE_ISSUER_UID                   = 0x42011B;
    public static final int CERTIFICATE_ISSUER_SERIAL_NUMBER         = 0x42011C;
    public static final int CERTIFICATE_ISSUER_TITLE                 = 0x42011D;
    public static final int CERTIFICATE_ISSUER_DC                    = 0x42011E;
    public static final int CERTIFICATE_ISSUER_DN_QUALIFIER          = 0x42011F;
    public static final int SENSITIVE                                = 0x420120;
    public static final int ALWAYS_SENSITIVE                         = 0x420121;
    public static final int EXTRACTABLE                              = 0x420122;
    public static final int NEVER_EXTRACTABLE                        = 0x420123;
    public static final int REPLACE_EXISTING                         = 0x420124;
	
	static{
		values = new HashMap<>();
		Field[] fields = EnumTag.class.getDeclaredFields();
		for (Field f : fields) {
		    if (Modifier.isStatic(f.getModifiers()) && Modifier.isFinal(f.getModifiers())){
		    	try {
					values.put(f.getName(),f.getInt(EnumTag.class));
				} catch (Exception e) {
					e.printStackTrace();
				}
		    } 
		}
	}
	
	public EnumTag(){
		try {
			this.value = getEntry(EnumTag.Default, values);
		} catch (KMIPEnumUndefinedValueException e) {
			e.printStackTrace();
		}
	}
	
	public EnumTag(int value){
		try {
			this.value = getEntry(value, values);
		} catch (KMIPEnumUndefinedValueException e) {
			e.printStackTrace();
		}
	}
	
	public EnumTag(String key){
		setValue(key);
	}
	
	public void setValue(String value){
		try {
			this.value = getEntry(value, values);
		} catch (KMIPEnumUndefinedKeyException e) {
			try{
				int intValue;
				if(value.length() > 1 && value.substring(0,2).equals("0x")){
					intValue = java.lang.Integer.parseInt(value.substring(2), 16);
				}
				else{
					intValue = java.lang.Integer.parseInt(value);
				}
				this.value = getEntry(intValue, values);
			}
			catch(KMIPEnumUndefinedValueException e1){
				e1.printStackTrace();
			}	
		}
	}

}
