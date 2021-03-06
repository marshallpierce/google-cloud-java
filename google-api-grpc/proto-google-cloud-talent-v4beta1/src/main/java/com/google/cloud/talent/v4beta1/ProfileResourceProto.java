// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/profile.proto

package com.google.cloud.talent.v4beta1;

public final class ProfileResourceProto {
  private ProfileResourceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Profile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Profile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Profile_CustomAttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Profile_CustomAttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Resume_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Resume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_PersonName_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_PersonName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_PersonName_PersonStructuredName_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_PersonName_PersonStructuredName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Address_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Address_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Email_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Email_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Phone_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Phone_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_PersonalUri_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_PersonalUri_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_AdditionalContactInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_AdditionalContactInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_EmploymentRecord_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_EmploymentRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_EducationRecord_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_EducationRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Degree_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Degree_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Activity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Activity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Publication_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Publication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Patent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Patent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/talent/v4beta1/profile.pr"
          + "oto\022\033google.cloud.talent.v4beta1\032\034google"
          + "/api/annotations.proto\032\037google/api/field"
          + "_behavior.proto\032(google/cloud/talent/v4b"
          + "eta1/common.proto\032\036google/protobuf/durat"
          + "ion.proto\032\037google/protobuf/timestamp.pro"
          + "to\032\036google/protobuf/wrappers.proto\032\026goog"
          + "le/type/date.proto\032 google/type/postal_a"
          + "ddress.proto\"\313\013\n\007Profile\022\014\n\004name\030\001 \001(\t\022\023"
          + "\n\013external_id\030\002 \001(\t\022\016\n\006source\030\003 \001(\t\022\013\n\003u"
          + "ri\030\004 \001(\t\022\020\n\010group_id\030\005 \001(\t\022.\n\nis_hirable"
          + "\030\006 \001(\0132\032.google.protobuf.BoolValue\022/\n\013cr"
          + "eate_time\030\007 \001(\0132\032.google.protobuf.Timest"
          + "amp\022/\n\013update_time\030\010 \001(\0132\032.google.protob"
          + "uf.Timestamp\0223\n\006resume\0305 \001(\0132#.google.cl"
          + "oud.talent.v4beta1.Resume\022=\n\014person_name"
          + "s\030\013 \003(\0132\'.google.cloud.talent.v4beta1.Pe"
          + "rsonName\0227\n\taddresses\030\014 \003(\0132$.google.clo"
          + "ud.talent.v4beta1.Address\022;\n\017email_addre"
          + "sses\030\r \003(\0132\".google.cloud.talent.v4beta1"
          + ".Email\0229\n\rphone_numbers\030\016 \003(\0132\".google.c"
          + "loud.talent.v4beta1.Phone\022?\n\rpersonal_ur"
          + "is\030\017 \003(\0132(.google.cloud.talent.v4beta1.P"
          + "ersonalUri\022S\n\027additional_contact_info\030\020 "
          + "\003(\01322.google.cloud.talent.v4beta1.Additi"
          + "onalContactInfo\022I\n\022employment_records\030\021 "
          + "\003(\0132-.google.cloud.talent.v4beta1.Employ"
          + "mentRecord\022G\n\021education_records\030\022 \003(\0132,."
          + "google.cloud.talent.v4beta1.EducationRec"
          + "ord\0222\n\006skills\030\023 \003(\0132\".google.cloud.talen"
          + "t.v4beta1.Skill\0229\n\nactivities\030\024 \003(\0132%.go"
          + "ogle.cloud.talent.v4beta1.Activity\022>\n\014pu"
          + "blications\030\025 \003(\0132(.google.cloud.talent.v"
          + "4beta1.Publication\0224\n\007patents\030\026 \003(\0132#.go"
          + "ogle.cloud.talent.v4beta1.Patent\022B\n\016cert"
          + "ifications\030\027 \003(\0132*.google.cloud.talent.v"
          + "4beta1.Certification\022\024\n\014applications\030/ \003"
          + "(\t\022\023\n\013assignments\0300 \003(\t\022U\n\021custom_attrib"
          + "utes\030\032 \003(\0132:.google.cloud.talent.v4beta1"
          + ".Profile.CustomAttributesEntry\022\026\n\tproces"
          + "sed\030\033 \001(\010B\003\340A\003\022\034\n\017keyword_snippet\030\034 \001(\tB"
          + "\003\340A\003\022E\n\021derived_addresses\030@ \003(\0132%.google"
          + ".cloud.talent.v4beta1.LocationB\003\340A\003\032e\n\025C"
          + "ustomAttributesEntry\022\013\n\003key\030\001 \001(\t\022;\n\005val"
          + "ue\030\002 \001(\0132,.google.cloud.talent.v4beta1.C"
          + "ustomAttribute:\0028\001\"\265\001\n\006Resume\022\031\n\021structu"
          + "red_resume\030\001 \001(\t\022C\n\013resume_type\030\002 \001(\0162.."
          + "google.cloud.talent.v4beta1.Resume.Resum"
          + "eType\"K\n\nResumeType\022\033\n\027RESUME_TYPE_UNSPE"
          + "CIFIED\020\000\022\t\n\005HRXML\020\001\022\025\n\021OTHER_RESUME_TYPE"
          + "\020\002\"\274\002\n\nPersonName\022\030\n\016formatted_name\030\001 \001("
          + "\tH\000\022W\n\017structured_name\030\002 \001(\0132<.google.cl"
          + "oud.talent.v4beta1.PersonName.PersonStru"
          + "cturedNameH\000\022\026\n\016preferred_name\030\003 \001(\t\032\223\001\n"
          + "\024PersonStructuredName\022\022\n\ngiven_name\030\001 \001("
          + "\t\022\026\n\016preferred_name\030\006 \001(\t\022\026\n\016middle_init"
          + "ial\030\002 \001(\t\022\023\n\013family_name\030\003 \001(\t\022\020\n\010suffix"
          + "es\030\004 \003(\t\022\020\n\010prefixes\030\005 \003(\tB\r\n\013person_nam"
          + "e\"\331\001\n\007Address\022<\n\005usage\030\001 \001(\0162-.google.cl"
          + "oud.talent.v4beta1.ContactInfoUsage\022\036\n\024u"
          + "nstructured_address\030\002 \001(\tH\000\0228\n\022structure"
          + "d_address\030\003 \001(\0132\032.google.type.PostalAddr"
          + "essH\000\022+\n\007current\030\004 \001(\0132\032.google.protobuf"
          + ".BoolValueB\t\n\007address\"\\\n\005Email\022<\n\005usage\030"
          + "\001 \001(\0162-.google.cloud.talent.v4beta1.Cont"
          + "actInfoUsage\022\025\n\remail_address\030\002 \001(\t\"\317\002\n\005"
          + "Phone\022<\n\005usage\030\001 \001(\0162-.google.cloud.tale"
          + "nt.v4beta1.ContactInfoUsage\022:\n\004type\030\002 \001("
          + "\0162,.google.cloud.talent.v4beta1.Phone.Ph"
          + "oneType\022\016\n\006number\030\003 \001(\t\022\026\n\016when_availabl"
          + "e\030\004 \001(\t\"\243\001\n\tPhoneType\022\032\n\026PHONE_TYPE_UNSP"
          + "ECIFIED\020\000\022\014\n\010LANDLINE\020\001\022\n\n\006MOBILE\020\002\022\007\n\003F"
          + "AX\020\003\022\t\n\005PAGER\020\004\022\016\n\nTTY_OR_TDD\020\005\022\r\n\tVOICE"
          + "MAIL\020\006\022\013\n\007VIRTUAL\020\007\022\010\n\004VOIP\020\010\022\026\n\022MOBILE_"
          + "OR_LANDLINE\020\t\"\032\n\013PersonalUri\022\013\n\003uri\030\001 \001("
          + "\t\"w\n\025AdditionalContactInfo\022<\n\005usage\030\001 \001("
          + "\0162-.google.cloud.talent.v4beta1.ContactI"
          + "nfoUsage\022\014\n\004name\030\002 \001(\t\022\022\n\ncontact_id\030\003 \001"
          + "(\t\"\362\003\n\020EmploymentRecord\022%\n\nstart_date\030\001 "
          + "\001(\0132\021.google.type.Date\022#\n\010end_date\030\002 \001(\013"
          + "2\021.google.type.Date\022\025\n\remployer_name\030\003 \001"
          + "(\t\022\025\n\rdivision_name\030\004 \001(\t\0225\n\007address\030\005 \001"
          + "(\0132$.google.cloud.talent.v4beta1.Address"
          + "\022\021\n\tjob_title\030\006 \001(\t\022\027\n\017job_description\030\007"
          + " \001(\t\0221\n\ris_supervisor\030\010 \001(\0132\032.google.pro"
          + "tobuf.BoolValue\0224\n\020is_self_employed\030\t \001("
          + "\0132\032.google.protobuf.BoolValue\022.\n\nis_curr"
          + "ent\030\n \001(\0132\032.google.protobuf.BoolValue\022\036\n"
          + "\021job_title_snippet\030\013 \001(\tB\003\340A\003\022$\n\027job_des"
          + "cription_snippet\030\014 \001(\tB\003\340A\003\022\"\n\025employer_"
          + "name_snippet\030\r \001(\tB\003\340A\003\"\314\003\n\017EducationRec"
          + "ord\022%\n\nstart_date\030\001 \001(\0132\021.google.type.Da"
          + "te\022#\n\010end_date\030\002 \001(\0132\021.google.type.Date\022"
          + "3\n\030expected_graduation_date\030\003 \001(\0132\021.goog"
          + "le.type.Date\022\023\n\013school_name\030\004 \001(\t\0225\n\007add"
          + "ress\030\005 \001(\0132$.google.cloud.talent.v4beta1"
          + ".Address\022\034\n\022degree_description\030\006 \001(\tH\000\022@"
          + "\n\021structured_degree\030\007 \001(\0132#.google.cloud"
          + ".talent.v4beta1.DegreeH\000\022\023\n\013description\030"
          + "\010 \001(\t\022.\n\nis_current\030\t \001(\0132\032.google.proto"
          + "buf.BoolValue\022 \n\023school_name_snippet\030\n \001"
          + "(\tB\003\340A\003\022\033\n\016degree_snippet\030\013 \001(\tB\003\340A\003B\010\n\006"
          + "degree\"t\n\006Degree\022<\n\013degree_type\030\001 \001(\0162\'."
          + "google.cloud.talent.v4beta1.DegreeType\022\023"
          + "\n\013degree_name\030\002 \001(\t\022\027\n\017fields_of_study\030\003"
          + " \003(\t\"\322\002\n\010Activity\022\024\n\014display_name\030\001 \001(\t\022"
          + "\023\n\013description\030\002 \001(\t\022\013\n\003uri\030\003 \001(\t\022&\n\013cre"
          + "ate_date\030\004 \001(\0132\021.google.type.Date\022&\n\013upd"
          + "ate_date\030\005 \001(\0132\021.google.type.Date\022\024\n\014tea"
          + "m_members\030\006 \003(\t\0227\n\013skills_used\030\007 \003(\0132\".g"
          + "oogle.cloud.talent.v4beta1.Skill\022\"\n\025acti"
          + "vity_name_snippet\030\010 \001(\tB\003\340A\003\022)\n\034activity"
          + "_description_snippet\030\t \001(\tB\003\340A\003\022 \n\023skill"
          + "s_used_snippet\030\n \003(\tB\003\340A\003\"\313\001\n\013Publicatio"
          + "n\022\017\n\007authors\030\001 \003(\t\022\r\n\005title\030\002 \001(\t\022\023\n\013des"
          + "cription\030\003 \001(\t\022\017\n\007journal\030\004 \001(\t\022\016\n\006volum"
          + "e\030\005 \001(\t\022\021\n\tpublisher\030\006 \001(\t\022+\n\020publicatio"
          + "n_date\030\007 \001(\0132\021.google.type.Date\022\030\n\020publi"
          + "cation_type\030\010 \001(\t\022\014\n\004isbn\030\t \001(\t\"\251\002\n\006Pate"
          + "nt\022\024\n\014display_name\030\001 \001(\t\022\021\n\tinventors\030\002 "
          + "\003(\t\022\025\n\rpatent_status\030\003 \001(\t\022-\n\022patent_sta"
          + "tus_date\030\004 \001(\0132\021.google.type.Date\022-\n\022pat"
          + "ent_filing_date\030\005 \001(\0132\021.google.type.Date"
          + "\022\025\n\rpatent_office\030\006 \001(\t\022\025\n\rpatent_number"
          + "\030\007 \001(\t\022\032\n\022patent_description\030\010 \001(\t\0227\n\013sk"
          + "ills_used\030\t \003(\0132\".google.cloud.talent.v4"
          + "beta1.SkillB\202\001\n\037com.google.cloud.talent."
          + "v4beta1B\024ProfileResourceProtoP\001ZAgoogle."
          + "golang.org/genproto/googleapis/cloud/tal"
          + "ent/v4beta1;talent\242\002\003CTSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.type.DateProto.getDescriptor(),
          com.google.type.PostalAddressProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_talent_v4beta1_Profile_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_Profile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Profile_descriptor,
            new java.lang.String[] {
              "Name",
              "ExternalId",
              "Source",
              "Uri",
              "GroupId",
              "IsHirable",
              "CreateTime",
              "UpdateTime",
              "Resume",
              "PersonNames",
              "Addresses",
              "EmailAddresses",
              "PhoneNumbers",
              "PersonalUris",
              "AdditionalContactInfo",
              "EmploymentRecords",
              "EducationRecords",
              "Skills",
              "Activities",
              "Publications",
              "Patents",
              "Certifications",
              "Applications",
              "Assignments",
              "CustomAttributes",
              "Processed",
              "KeywordSnippet",
              "DerivedAddresses",
            });
    internal_static_google_cloud_talent_v4beta1_Profile_CustomAttributesEntry_descriptor =
        internal_static_google_cloud_talent_v4beta1_Profile_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_Profile_CustomAttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Profile_CustomAttributesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_talent_v4beta1_Resume_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_Resume_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Resume_descriptor,
            new java.lang.String[] {
              "StructuredResume", "ResumeType",
            });
    internal_static_google_cloud_talent_v4beta1_PersonName_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_PersonName_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_PersonName_descriptor,
            new java.lang.String[] {
              "FormattedName", "StructuredName", "PreferredName", "PersonName",
            });
    internal_static_google_cloud_talent_v4beta1_PersonName_PersonStructuredName_descriptor =
        internal_static_google_cloud_talent_v4beta1_PersonName_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_PersonName_PersonStructuredName_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_PersonName_PersonStructuredName_descriptor,
            new java.lang.String[] {
              "GivenName", "PreferredName", "MiddleInitial", "FamilyName", "Suffixes", "Prefixes",
            });
    internal_static_google_cloud_talent_v4beta1_Address_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_Address_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Address_descriptor,
            new java.lang.String[] {
              "Usage", "UnstructuredAddress", "StructuredAddress", "Current", "Address",
            });
    internal_static_google_cloud_talent_v4beta1_Email_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_Email_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Email_descriptor,
            new java.lang.String[] {
              "Usage", "EmailAddress",
            });
    internal_static_google_cloud_talent_v4beta1_Phone_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_Phone_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Phone_descriptor,
            new java.lang.String[] {
              "Usage", "Type", "Number", "WhenAvailable",
            });
    internal_static_google_cloud_talent_v4beta1_PersonalUri_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_talent_v4beta1_PersonalUri_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_PersonalUri_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_talent_v4beta1_AdditionalContactInfo_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_talent_v4beta1_AdditionalContactInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_AdditionalContactInfo_descriptor,
            new java.lang.String[] {
              "Usage", "Name", "ContactId",
            });
    internal_static_google_cloud_talent_v4beta1_EmploymentRecord_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_talent_v4beta1_EmploymentRecord_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_EmploymentRecord_descriptor,
            new java.lang.String[] {
              "StartDate",
              "EndDate",
              "EmployerName",
              "DivisionName",
              "Address",
              "JobTitle",
              "JobDescription",
              "IsSupervisor",
              "IsSelfEmployed",
              "IsCurrent",
              "JobTitleSnippet",
              "JobDescriptionSnippet",
              "EmployerNameSnippet",
            });
    internal_static_google_cloud_talent_v4beta1_EducationRecord_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_talent_v4beta1_EducationRecord_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_EducationRecord_descriptor,
            new java.lang.String[] {
              "StartDate",
              "EndDate",
              "ExpectedGraduationDate",
              "SchoolName",
              "Address",
              "DegreeDescription",
              "StructuredDegree",
              "Description",
              "IsCurrent",
              "SchoolNameSnippet",
              "DegreeSnippet",
              "Degree",
            });
    internal_static_google_cloud_talent_v4beta1_Degree_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_talent_v4beta1_Degree_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Degree_descriptor,
            new java.lang.String[] {
              "DegreeType", "DegreeName", "FieldsOfStudy",
            });
    internal_static_google_cloud_talent_v4beta1_Activity_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_talent_v4beta1_Activity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Activity_descriptor,
            new java.lang.String[] {
              "DisplayName",
              "Description",
              "Uri",
              "CreateDate",
              "UpdateDate",
              "TeamMembers",
              "SkillsUsed",
              "ActivityNameSnippet",
              "ActivityDescriptionSnippet",
              "SkillsUsedSnippet",
            });
    internal_static_google_cloud_talent_v4beta1_Publication_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_talent_v4beta1_Publication_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Publication_descriptor,
            new java.lang.String[] {
              "Authors",
              "Title",
              "Description",
              "Journal",
              "Volume",
              "Publisher",
              "PublicationDate",
              "PublicationType",
              "Isbn",
            });
    internal_static_google_cloud_talent_v4beta1_Patent_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_talent_v4beta1_Patent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Patent_descriptor,
            new java.lang.String[] {
              "DisplayName",
              "Inventors",
              "PatentStatus",
              "PatentStatusDate",
              "PatentFilingDate",
              "PatentOffice",
              "PatentNumber",
              "PatentDescription",
              "SkillsUsed",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
    com.google.type.PostalAddressProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
