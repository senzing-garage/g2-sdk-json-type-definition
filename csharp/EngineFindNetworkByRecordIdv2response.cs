// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    [JsonConverter(typeof(EngineFindNetworkByRecordIdv2responseJsonConverter))]
    public class EngineFindNetworkByRecordIdv2response
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public Network Value { get; set; }
    }

    public class EngineFindNetworkByRecordIdv2responseJsonConverter : JsonConverter<EngineFindNetworkByRecordIdv2response>
    {
        public override EngineFindNetworkByRecordIdv2response Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new EngineFindNetworkByRecordIdv2response { Value = JsonSerializer.Deserialize<Network>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, EngineFindNetworkByRecordIdv2response value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<Network>(writer, value.Value, options);
        }
    }
}
