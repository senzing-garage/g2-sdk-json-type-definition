// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Collections.Generic;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(MatchScoresForAttributeJsonConverter))]
    public class MatchScoresForAttribute
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public IList<MatchScoreForAttribute> Value { get; set; }
    }

    public class MatchScoresForAttributeJsonConverter : JsonConverter<MatchScoresForAttribute>
    {
        public override MatchScoresForAttribute Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new MatchScoresForAttribute { Value = JsonSerializer.Deserialize<IList<MatchScoreForAttribute>>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, MatchScoresForAttribute value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<IList<MatchScoreForAttribute>>(writer, value.Value, options);
        }
    }
}