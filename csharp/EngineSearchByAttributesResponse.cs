// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    [JsonConverter(typeof(EngineSearchByAttributesResponseJsonConverter))]
    public class EngineSearchByAttributesResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public Search Value { get; set; }
    }

    public class EngineSearchByAttributesResponseJsonConverter : JsonConverter<EngineSearchByAttributesResponse>
    {
        public override EngineSearchByAttributesResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new EngineSearchByAttributesResponse { Value = JsonSerializer.Deserialize<Search>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, EngineSearchByAttributesResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<Search>(writer, value.Value, options);
        }
    }
}
