// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Senzing
{
    public class Record
    {
        [JsonPropertyName("ADDRESS_DATA")]
        public IList<string> AddressData { get; set; }

        [JsonPropertyName("ATTRIBUTE_DATA")]
        public IList<string> AttributeData { get; set; }

        [JsonPropertyName("DATA_SOURCE")]
        public string DataSource { get; set; }

        [JsonPropertyName("ENTITY_DATA")]
        public IList<string> EntityData { get; set; }

        [JsonPropertyName("ENTITY_DESC")]
        public string EntityDesc { get; set; }

        [JsonPropertyName("ENTITY_KEY")]
        public string EntityKey { get; set; }

        [JsonPropertyName("ENTITY_TYPE")]
        public string EntityType { get; set; }

        [JsonPropertyName("ERRULE_CODE")]
        public string ErruleCode { get; set; }

        [JsonPropertyName("FEATURES")]
        public IList<RecordFeatures> Features { get; set; }

        [JsonPropertyName("IDENTIFIER_DATA")]
        public IList<string> IdentifierData { get; set; }

        [JsonPropertyName("INTERNAL_ID")]
        public int InternalId { get; set; }

        [JsonPropertyName("JSON_DATA")]
        public string JsonData { get; set; }

        [JsonPropertyName("LAST_SEEN_DT")]
        public DateTimeOffset LastSeenDt { get; set; }

        [JsonPropertyName("MATCH_KEY")]
        public string MatchKey { get; set; }

        [JsonPropertyName("MATCH_LEVEL")]
        public int MatchLevel { get; set; }

        [JsonPropertyName("MATCH_LEVEL_CODE")]
        public string MatchLevelCode { get; set; }

        [JsonPropertyName("NAME_DATA")]
        public IList<string> NameData { get; set; }

        [JsonPropertyName("OTHER_DATA")]
        public IList<string> OtherData { get; set; }

        [JsonPropertyName("PHONE_DATA")]
        public IList<string> PhoneData { get; set; }

        [JsonPropertyName("RECORD_ID")]
        public string RecordId { get; set; }

        [JsonPropertyName("RELATIONSHIP_DATA")]
        public IList<string> RelationshipData { get; set; }
    }
}
