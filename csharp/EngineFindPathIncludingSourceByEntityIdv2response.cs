// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    [JsonConverter(typeof(EngineFindPathIncludingSourceByEntityIdv2responseJsonConverter))]
    public class EngineFindPathIncludingSourceByEntityIdv2response
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public Path Value { get; set; }
    }

    public class EngineFindPathIncludingSourceByEntityIdv2responseJsonConverter : JsonConverter<EngineFindPathIncludingSourceByEntityIdv2response>
    {
        public override EngineFindPathIncludingSourceByEntityIdv2response Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new EngineFindPathIncludingSourceByEntityIdv2response { Value = JsonSerializer.Deserialize<Path>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, EngineFindPathIncludingSourceByEntityIdv2response value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<Path>(writer, value.Value, options);
        }
    }
}
