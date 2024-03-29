// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class WhyResult
    {
        /// <summary>
        /// The ENTITY_ID is the Senzing-generated identifier for the discovered
        /// entity. It may change when new information is added.
        /// </summary>
        [JsonPropertyName("ENTITY_ID")]
        public int EntityId { get; set; }

        [JsonPropertyName("ENTITY_ID_2")]
        public int EntityId0 { get; set; }

        [JsonPropertyName("FOCUS_RECORDS")]
        public FocusRecords FocusRecords { get; set; }

        [JsonPropertyName("FOCUS_RECORDS_2")]
        public FocusRecords FocusRecords0 { get; set; }

        [JsonPropertyName("INTERNAL_ID")]
        public int InternalId { get; set; }

        [JsonPropertyName("INTERNAL_ID_2")]
        public int InternalId0 { get; set; }

        [JsonPropertyName("MATCH_INFO")]
        public MatchInfo MatchInfo { get; set; }
    }
}
