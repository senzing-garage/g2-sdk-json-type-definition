// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    public class WhyResult
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ENTITY_ID")]
        public int EntityId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ENTITY_ID_2")]
        public int EntityId0 { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("FOCUS_RECORDS")]
        public FocusRecords FocusRecords { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("FOCUS_RECORDS_2")]
        public FocusRecords FocusRecords0 { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("INTERNAL_ID")]
        public int InternalId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("INTERNAL_ID_2")]
        public int InternalId0 { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("MATCH_INFO")]
        public MatchInfo MatchInfo { get; set; }
    }
}