// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    public class Record
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ADDRESS_DATA")]
        public IList<string> AddressData { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ATTRIBUTE_DATA")]
        public IList<string> AttributeData { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("DATA_SOURCE")]
        public string DataSource { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ENTITY_DATA")]
        public IList<string> EntityData { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ENTITY_DESC")]
        public string EntityDesc { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ENTITY_KEY")]
        public string EntityKey { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ENTITY_TYPE")]
        public string EntityType { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ERRULE_CODE")]
        public string ErruleCode { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("FEATURES")]
        public IList<RecordFeatures> Features { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("IDENTIFIER_DATA")]
        public IList<string> IdentifierData { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("INTERNAL_ID")]
        public int InternalId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("JSON_DATA")]
        public JsonData JsonData { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("LAST_SEEN_DT")]
        public string LastSeenDt { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("MATCH_KEY")]
        public string MatchKey { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("MATCH_LEVEL")]
        public int MatchLevel { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("MATCH_LEVEL_CODE")]
        public string MatchLevelCode { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("NAME_DATA")]
        public IList<string> NameData { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("OTHER_DATA")]
        public IList<string> OtherData { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("PHONE_DATA")]
        public IList<string> PhoneData { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("RECORD_ID")]
        public string RecordId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("RELATIONSHIP_DATA")]
        public IList<string> RelationshipData { get; set; }
    }
}
